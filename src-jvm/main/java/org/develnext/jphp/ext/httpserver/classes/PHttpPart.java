package org.develnext.jphp.ext.httpserver.classes;

import org.apache.commons.io.FileUtils;
import org.develnext.jphp.ext.httpserver.HttpServerExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Reflection.Name("HttpPart")
@Reflection.Namespace(HttpServerExtension.NS)
public class PHttpPart extends BaseWrapper<Part> {
    public PHttpPart(Environment env, Part wrappedObject) {
        super(env, wrappedObject);
    }

    public PHttpPart(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public InputStream stream() throws IOException {
        return getWrappedObject().getInputStream();
    }

    @Reflection.Signature
    public String getName() {
        return getWrappedObject().getName();
    }

    @Reflection.Signature
    public String getContentType() {
        return getWrappedObject().getContentType();
    }

    @Reflection.Signature
    public String getSubmittedFileName() {
        return getWrappedObject().getSubmittedFileName();
    }

    @Reflection.Signature
    public long getSize() {
        return getWrappedObject().getSize();
    }

    @Reflection.Signature
    public void write(String path) throws IOException {
        FileUtils.copyInputStreamToFile(getWrappedObject().getInputStream(), new File(path));
    }
}
