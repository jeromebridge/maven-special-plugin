Maven Special Plugin
====================

Simple plugin that adds special Life Cycle phases to run adhoc plugins from Maven build.  This plugin could be useful to you if you want a "utility" phase in your Maven build that does nothing but execute the plugins you attach to it.

Add the following plugin configuration to your maven pom.xml:

    <plugin>
      <groupId>tools.osgi</groupId>
      <artifactId>maven-special-plugin</artifactId>
      <version>1.0</version>
      <extensions>true</extensions>
    </plugin>
    
This will allow you to execute the following phase from the command line:

    mvn special
    
Which will result in nothing happening if you do not hook any plugins to it:

    <plugin>
      <groupId>org.codehaus.mojo</groupId>
      <artifactId>exec-maven-plugin</artifactId>
      <version>1.3.1</version>
      <executions>
        <execution>
          <id>some-special-shit</id>
          <phase>special</phase>
          <goals>
            <goal>java</goal>
          </goals>
          <configuration>
            <mainClass>com.special.Main</mainClass>
          </configuration>
        </execution>
      </executions>
    </plugin>

Now your Java main class would be executed when the *special* phase is executed.
