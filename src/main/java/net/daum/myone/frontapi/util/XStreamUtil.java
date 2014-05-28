package net.daum.myone.frontapi.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class XStreamUtil {

	private static final String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
	private static final String soapXmlHeader = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"" + 
												"                  soap:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\"" + 
												"                           xmlns:xsi=\"http://www.w3.org/1999/XMLSchema-instance\"" +
												"                           xmlns:xsd=\"http://www.w3.org/1999/XMLSchema\">" +
												"<soap:Body>";	
	private static final String soapXmlFooter = "</soap:Body></soap:Envelope>";
	
	public static String toXML(Object obj) {
		
		XStream xStream = new XStream(new DomDriver("UTF-8"));
//		xStream.setMode(XStream.NO_REFERENCES);
//		xStream.processAnnotations(obj.getClass());
		xStream.autodetectAnnotations(true);
		String xml = xmlHeader + xStream.toXML(obj);
		
		return xml;
	}
	
	public static String toXmlSoap(Object obj) {
		XStream xStream = new XStream(new DomDriver("UTF-8"));
		
		xStream.autodetectAnnotations(true);
		String xml = soapXmlHeader + xStream.toXML(obj)+soapXmlFooter;
		
		return xml;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T toObject(String data, Class<?> ... classes) {
		
		XStream xStream = new XStream(new DomDriver()) {
            protected MapperWrapper wrapMapper(MapperWrapper next) {
                return new MapperWrapper(next) {
                    public boolean shouldSerializeMember(Class definedIn, String fieldName) {
                        return definedIn != Object.class ? super.shouldSerializeMember(definedIn, fieldName) : false;
                    }
                };
            }
        };
        
//		xStream.setMode(XStream.NO_REFERENCES);
		for (Class<?> clazz : classes) {
			xStream.processAnnotations(clazz);
		}
		Object object = xStream.fromXML(data);

		return (T) object;
	}
	
}
