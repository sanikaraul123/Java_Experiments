import java.awt.*;
import java.awt.event.*;

public class StudentProfileForm extends Frame {
    TextField nameField, rollNumberField;
    Choice courseChoice;

    TextArea profileTextArea;

    public StudentProfileForm() {
        setTitle("Student Profile Form");
        setSize(400, 300);
        setLayout(new FlowLayout());
        Label nameLabel = new Label("Name:");
        Label rollNumberLabel = new Label("Roll Number:");
        Label courseLabel = new Label("Course:");
        nameField = new TextField(20);
        rollNumberField = new TextField(10);
        courseChoice = new Choice();
        courseChoice.add("Select Course");
        courseChoice.add("Computer Science");
        courseChoice.add("Electrical Engineering");
        courseChoice.add("Mechanical Engineering");
        courseChoice.add("Physics");
        courseChoice.add("Mathematics");
        profileTextArea = new TextArea(10, 30);
        Button submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayProfile();
            }
        });
        add(nameLabel);
        add(nameField);
        add(rollNumberLabel);
        add(rollNumberField);
        add(courseLabel);
        add(courseChoice);
        add(submitButton);
        add(profileTextArea);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void displayProfile() {
        String name = nameField.getText();
        String rollNumber = rollNumberField.getText();
        String course = courseChoice.getSelectedItem();

        if (!name.isEmpty() && !rollNumber.isEmpty() && !course.equals("Select Course")) {
            String profile = "Name: " + name + "\nRoll Number: " + rollNumber + "\nCourse: " + course;
            profileTextArea.setText(profile);
        } else {
            profileTextArea.setText("Please fill in all fields.");
        }
    }

    public static void main(String[] args) {
        StudentProfileForm profileForm = new StudentProfileForm();
        profileForm.setVisible(true);
    }
}
