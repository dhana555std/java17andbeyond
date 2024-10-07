package org.dhana.preview;

/**
   Preview:-
   <ul>
      <li>Java Versioning LTS vs Preview</li>
      <li>Current Version</li>
      <li>JEP</li>
      <li>https://openjdk.org/projects/jdk/{version-number}</li>
      <li>https://nipafx.dev/inside-java-newscast-71/</li>
   </ul>
 */
public class PreviewDemo {
    public static void main(String[] args) {
        String firstName = "Lord";
        String lastName = "Meher";
        var message = STR."\{firstName} \{lastName}.";
        System.out.println(message);
    }
}
