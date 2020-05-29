package com.puc.sca.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Aplicação utilitária spring boot utilizada como dependência maven em outras aplicações.
 * 
 * Deploy local utilizar no pom.xml:
 * Configurar o spring-boot-maven-plugin, com a configuração <classifier>exec</classifier>
 * 
 * Passos para dar deploy de uma dependência (package) no github:
 * 1 - Gerar um token de autorização de acesso na conta do github (o token deve ter as permissões read:packages e write:packages): 
 *     https://help.github.com/pt/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line (Logar na conta do github > Settings > Developer settings > Personal access token)
       e configurar no settings.xml do maven
       
     <server>
      <id>github</id>
      <username>breno500as</username>
      <password>9de8b339de4a65ce452e959615f75c86f63f0771</password>
     </server>
 
 
 * 2 - Configurar no settings.xml do maven as propriedades: server (com usuário e o token de acesso) e profiles (apontando para o repositório com o endereço do remoto do github)
 * 
 *  <profile>
      <id>hml</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
          <releases><enabled>true</enabled></releases>
          <snapshots><enabled>true</enabled></snapshots>
        </repository>
        <repository>
          <id>github</id>
          <name>GitHub OWNER Apache Maven Packages</name>
          <url>https://maven.pkg.github.com/breno500as/sca-util</url>
          <releases><enabled>true</enabled></releases>
          <snapshots><enabled>true</enabled></snapshots>
        </repository>
      </repositories>
    </profile>
 *  
 * 3 - Configurar no pom dessa aplicação o distributionManagement apontando para o endereço do repositório remoto do github
 * 4 - Executar o deploy da aplicação maven (por linha de comando ou pela ide do eclipse): mvn deploy -Dregistry=https://maven.pkg.github.com/breno500as/sca-util -Dtoken=$3469dd9725e55914e6d98a8236b14215842d8c07
 * 5 - Sempre que for necessário atualizar a aplicação deve se atualizar a <version> da dependência no pom.xml e executar o passo 4 novamente
 * 
 * Exemplos:
 * https://help.github.com/pt/packages/using-github-packages-with-your-projects-ecosystem/configuring-apache-maven-for-use-with-github-packages
 * https://github.com/TobseF/github-plugin-registry-example
 * 
 * @author Breno
 *
 */

@SpringBootApplication
public class ScaUtilApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaUtilApplication.class, args);
	}

}
