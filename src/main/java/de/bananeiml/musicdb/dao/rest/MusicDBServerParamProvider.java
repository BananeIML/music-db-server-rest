package de.bananeiml.musicdb.dao.rest;

import de.cismet.commons.simplerestserver.ServerParamProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Martin Scholl
 */
@ServiceProvider(service = ServerParamProvider.class)
public class MusicDBServerParamProvider implements ServerParamProvider {

    @Override
    public Map<String, String> getServerParams() {
        final Map<String, String> params = new HashMap<String, String>(1);
        params.put("com.sun.jersey.config.property.package", "de.bananeiml.musicdb.dao.rest"); // NOI18N

        return Collections.unmodifiableMap(params);
    }
    
}
