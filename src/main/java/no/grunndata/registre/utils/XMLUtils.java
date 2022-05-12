package no.grunndata.registre.utils;

import lombok.SneakyThrows;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public class XMLUtils {

    @SneakyThrows
    public static String getXml(Object value, Class<?>... classesToBeBound) {
        JAXBContext jaxbContext = JAXBContext.newInstance(classesToBeBound);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        StringWriter stringWriter = new StringWriter();
        jaxbMarshaller.marshal(value, stringWriter);
        return stringWriter.toString();
    }

    @SneakyThrows
    public static <T> T getEntity(String xml, Class<?>... classesToBeBound) {
        JAXBContext jaxbContext = JAXBContext.newInstance(classesToBeBound);
        Unmarshaller contextUnarshaller = jaxbContext.createUnmarshaller();
        Object entity = contextUnarshaller.unmarshal(new StringReader(xml));
        return (T) entity;
    }
}
