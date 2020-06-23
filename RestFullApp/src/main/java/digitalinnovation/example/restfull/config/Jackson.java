package digitalinnovation.example.restfull.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.PackageVersion;
import digitalinnovation.example.restfull.enums.Raca;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.file.Files;

@Configuration
public class Jackson {
    @Bean
    public ObjectMapper objectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        //PROPRIEDADES NAO MAPEADAS NAO QUEBRAM
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //PROPRIEDADES VAZIA, FALHA
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        //Serializa datas
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.registerModule(racaModuleMapper());
        return objectMapper;
    }

    public SimpleModule racaModuleMapper(){
        SimpleModule dateModule = new SimpleModule("JSONRacaModule", PackageVersion.VERSION);
        dateModule.addSerializer(Raca.class,new RacaCerialize());
        dateModule.addDeserializer(Raca.class, new RacaDecerialize());
        return dateModule;
    }

    class RacaCerialize extends StdSerializer<Raca> {
        public RacaCerialize(){
            super(Raca.class);
        }

        @Override
        public void serialize(Raca raca, JsonGenerator json, SerializerProvider provider) throws IOException {
            json.writeString(raca.getValue());
        }
    }

    class RacaDecerialize extends StdDeserializer<Raca> {
        public RacaDecerialize(){
            super(Raca.class);
        }

        @Override
        public Raca deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return Raca.of(p.getText());
        }


    }
}
