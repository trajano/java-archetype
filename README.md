Java Artifact Archetype
=======================

This is the Java artifact archetype used by the organization.

It is configured to use the [Trajano organizational POM][1] as the parent
which provides it organizational standards including the use of the
[cleanpom-maven-plugin][2] to keep the POM standardized and sets up the basis
for the Maven site reports.

It has the following features:

* Depends on [JUnit][] to provide the test framework.
* Builds an OSGi compliant bundle
* Bullds `-sources`, `-javadoc`, `-test`, and `-test-sources` artifacts
* Uses [Jacoco][] to perform code coverage
* Uses [Checkstyle][], [PMD][] and [FindBugs][] to do code analysis using the
  rules defined by the [Trajano coding standards][3] 
* Activates [m2e-codestyle-maven-plugin], [Checkstyle][], [PMD][] and
  [FindBugs][] while in [Eclipse][]. 

It contains a sample Java project that ensures the artifacts generated will
not result in empty jars and pass [coding standards][3].

[1]: http://site.trajano.net/trajano/
[2]: http://site.trajano.net/cleanpom-maven-plugin/
[3]: http://site.trajano.net/coding-standards/
[commons-testing]: http://site.trajano.net/commons-testing/
[Jacoco]: http://www.eclemma.org/jacoco/
[Checkstyle]: http://checkstyle.sourceforge.net/
[PMD]: http://pmd.sourceforge.net/
[FindBugs]: http://findbugs.sourceforge.net/
[JUnit]: http://junit.org/
[Eclipse]: http://eclipse.org/
[m2e-codestyle-maven-plugin]: http://site.trajano.net/m2e-codestyle-maven-plugin/
