# springMV-BothConfiguration
Spring MVC BASICS

You can configure in two way your spring mvc project.
1.xml based configuration
2.Java based configuration

XML based configuration
  There are two files need to configure.Those are 1.web.xml,2.servlet.xml file.
  Web.xml for your web container to pick dispatcherservlet.
  servletName-servlet.xml for dispatcher servlet confgurations.
  it has configs of basepackage and internalresource view resolver.
  
  Java based config
  
  you have to create two file.
  create one class that should be extend abstractannotationDispatchservletinitilizer and have to implent three methods
  those method have servlet mapping configs,servletconfig,rootconfigs.
  
  second class you have use @configuration,@Compoenetscan(basepackage="").
  then create one method that method should  return internalresource view resolver obejct.
  before returning object should set two value
  1.prefix 2.suffix.


