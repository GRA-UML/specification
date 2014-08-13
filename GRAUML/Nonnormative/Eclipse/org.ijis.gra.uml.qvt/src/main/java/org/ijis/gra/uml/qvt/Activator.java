/*
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IJIS - initial API and implementation
 *
 */
package org.ijis.gra.uml.qvt;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
//import org.ijis.gra.uml.qvt.blackbox.Activator;

public class Activator extends EMFPlugin {

    public static final String PLUGIN_ID = "org.ijis.gra.uml.qvt"; //$NON-NLS-1$

    public static final Activator INSTANCE = new Activator();

    private static Implementation plugin;

    public Activator() {
        super(new ResourceLocator[] {});
    }
    // TODO: possible remove NIEM stuff from GRA
    public URI getNIEMpim2psmLocation() {
        return getTransformLocation("NIEMpim2psm");
    }

    // TODO: possible remove NIEM stuff from GRA
    public URI getNIEMpsm2xsdLocation() {
        return getTransformLocation("NIEMpsm2xsd");
    }
    // TODO: possible remove NIEM stuff from GRA
    public URI getNIEMmpdmodel2artifactLocation() {
        return getTransformLocation("NIEMmpdmodel2artifact");
    }

    public URI getGraSppmodel2artifactLocation() {
//        return getTransformLocation("GraSspModel2artifact");
//        return getTransformLocation("GraSspModel2annotation");
        return getTransformLocation("GraSspModel2template");
    }
    public URI getGraSppArtifact2modelLocation() {
        return getTransformLocation("GraSspArtifact2model");
    }

    protected URI getTransformLocation(final String name) {
        return URI.createPlatformPluginURI(PLUGIN_ID + "/src/main/qvt/" + name + ".qvto", true);
    }

    @Override
    public ResourceLocator getPluginResourceLocator() {
        return plugin;
    }

    public static Implementation getPlugin() {
        return plugin;
    }

    public static class Implementation extends EclipsePlugin {

        public Implementation() {
            super();

            plugin = this;
        }
    }
}
