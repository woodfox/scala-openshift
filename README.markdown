# Scala Web Application Example for Openshift

Scala web application example for openshift. It adds build, deploy and start hooks in openshift, so that the application could automatically compile and restart when commiting changes to git.

It's based on finatra_example(https://github.com/capotej/finatra-example)


## Maven Instructions

### Runs your app on port 7070

    mvn scala:run

### Testing

    mvn test

### Packaging (fatjar)

    mvn package

### To deploy on Openshift

    git commit
    git push origin master
