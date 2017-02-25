# Annotation-Bag
Collects all of the annotated classes in a code base based on configurations passed to the library.

# Intro
Annotations can tell a lot of information about your code base. If used accordingly they can show:

- how many test methods you have
- how many classes were created by Bob

    @author("bob")

- a (class count/date) chart of how new functionality developed in comparison to the test base, which can serve as a proof of test driven development

    @created("2/25/2017")
    
- a map of your requirements to your class names, where an id corresponds to a requirement

    @spec("453")

These are just some of the things you can do, but the possiblities are endless.
This library was developed to make it easier to extract this information from your code base as a whole.
