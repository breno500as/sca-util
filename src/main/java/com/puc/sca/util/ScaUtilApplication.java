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
 * 1 - Gerar um token de autorização de acesso na conta do github (o token deve ter as permissões read:packages e write:packages): https://help.github.com/pt/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line
 * 2 - Configurar no settings.xml do maven as propriedades: server (com usuário e o token de acesso) e um profile chamado github com o endereço do repositório remoto do github
 * 3 - Configurar no pom da aplicação o distributionManagement apontando para o endereço do repositório remoto do github
 * 4 - Executar o deploy da aplicação maven (por linha de comando ou pela ide do eclipse): mvn deploy -Dregistry=https://maven.pkg.github.com/breno500as/sca-util -Dtoken=$3469dd9725e55914e6d98a8236b14215842d8c07
 * 5 - As aplicações que desarem instalar essa dependencia devem ter a dependencia declarada no pom e o install deve utilizar o profile  do github: Ex: mvn install -P github
 * 6 - Sempre que for necessário atualizar a aplicação deve se atualizar a <version> da dependência no pom.xml e executar o passo 4 novamente
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
