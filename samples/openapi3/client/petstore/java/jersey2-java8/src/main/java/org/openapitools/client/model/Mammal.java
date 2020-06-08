/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.openapitools.client.JSON;

import javax.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


@JsonDeserialize(using = Mammal.MammalDeserializer.class)
@JsonSerialize(using = org.openapitools.client.model.Mammal.MammalSerializer.class)
public class Mammal extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Mammal.class.getName());


    public static class MammalSerializer extends StdSerializer<org.openapitools.client.model.Mammal> {

        public MammalSerializer(Class<org.openapitools.client.model.Mammal> t) {
            super(t);
        }

        public MammalSerializer() {
            this(null);
        }

        @Override
        public void serialize(org.openapitools.client.model.Mammal value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class MammalDeserializer extends StdDeserializer<Mammal> {
        public MammalDeserializer() {
            this(Mammal.class);
        }

        public MammalDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Mammal deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Mammal newMammal = new Mammal();
            Map<String, Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {
            });
            String discriminatorValue = (String) result2.get("className");
            switch (discriminatorValue) {
                case "Pig":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Pig.class);
                    newMammal.setActualInstance(deserialized);
                    return newMammal;
                case "whale":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Whale.class);
                    newMammal.setActualInstance(deserialized);
                    return newMammal;
                case "zebra":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Zebra.class);
                    newMammal.setActualInstance(deserialized);
                    return newMammal;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for Mammal. Possible values: Pig whale zebra", discriminatorValue));
            }

            int match = 0;
            // deserialize Pig
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Pig.class);
                // TODO: there is no validation against JSON schema constraints
                // (min, max, enum, pattern...), this does not perform a strict JSON
                // validation, which means the 'match' count may be higher than it should be.
                match++;
                log.log(Level.FINER, "Input data matches schema 'Pig'");
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Pig'", e);
            }

            // deserialize Whale
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Whale.class);
                // TODO: there is no validation against JSON schema constraints
                // (min, max, enum, pattern...), this does not perform a strict JSON
                // validation, which means the 'match' count may be higher than it should be.
                match++;
                log.log(Level.FINER, "Input data matches schema 'Whale'");
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Whale'", e);
            }

            // deserialize Zebra
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Zebra.class);
                // TODO: there is no validation against JSON schema constraints
                // (min, max, enum, pattern...), this does not perform a strict JSON
                // validation, which means the 'match' count may be higher than it should be.
                match++;
                log.log(Level.FINER, "Input data matches schema 'Zebra'");
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Zebra'", e);
            }

            if (match == 1) {
                Mammal ret = new Mammal();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for Mammal: %d classes match result, expected 1", match));
        }


        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public Mammal getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException("Mammal cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public final static Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public Mammal() {
        super("oneOf", Boolean.FALSE);
    }

    public Mammal(Pig o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Mammal(Whale o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Mammal(Zebra o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Pig", new GenericType<Pig>() {
        });
        schemas.put("Whale", new GenericType<Whale>() {
        });
        schemas.put("Zebra", new GenericType<Zebra>() {
        });
        JSON.registerDescendants(Mammal.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class> mappings = new HashMap<String, Class>();
        mappings.put("Pig", Pig.class);
        mappings.put("whale", Whale.class);
        mappings.put("zebra", Zebra.class);
        mappings.put("mammal", Mammal.class);
        JSON.registerDiscriminator(Mammal.class, "className", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return Mammal.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas.
     * <p>
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(Pig.class, instance, new HashSet<Class>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Whale.class, instance, new HashSet<Class>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Zebra.class, instance, new HashSet<Class>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Pig, Whale, Zebra");
    }


}

