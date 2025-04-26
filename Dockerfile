FROM openjdk:11-jdk

WORKDIR /app

# Copy the Java files
COPY *.java /app/
# Copy any other necessary files (excluding those in .gitignore)
COPY README.md /app/

# Compile the Java files
RUN javac App.java

# Run the application
CMD ["java", "App"]