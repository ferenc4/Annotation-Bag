# Annotation-Bag
Collects all of the annotated classes in a code base based on configurations passed to the library.

# Intro
Annotations can tell a lot of information about your code base. They can show:
- how many test methods you have
- how many and which classes were created by a specific user
<span>

    @author("bob")
</span>
- a (class count/date) chart of how new functionality developed in comparison to the test base, which can serve as a proof of test driven development
<span>

    @created("2/25/2017")
</span>
- a map of your requirements to your class names, where an id corresponds to a requirement
<span>

    @spec("453")
</span>
These are just some of the things you can do, but the possiblities are endless.
This library was developed to make it easier to extract this information from your code base as a whole.
