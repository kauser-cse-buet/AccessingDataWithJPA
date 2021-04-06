import java.io.FileReader;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.*;
public class XmlStaxParser{
    public static void main(String[] args){
        try{
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = factory.createXMLEventReader(new FileReader("data.xml"));
            while(eventReader.hasNext()){
                XMLEvent event = eventReader.nextEvent();
                switch(event.getEventType()){

                }


            }
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}