# Hi, I'm Abhishek Kushwaha! 👋


## Authors

- [@muscularcardinal99](https://www.github.com/muscularcardinal99)


## 🚀 About Me
I'm a Java developer...


## 🛠 Skills
Java, HTML, Springboot, MySQL...
## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/muscularcardinal99/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/LoneWolf_ak99)
# Doctor App

This is a Java Spring Boot application for managing doctor appointments in a hospital.

## Controllers

### AppointmentController

This controller is responsible for handling appointment-related endpoints.

#### Endpoints:

- `POST /appointment`

   Creates a new appointment by booking it.

### DoctorController

This controller is responsible for handling doctor-related endpoints.

#### Endpoints:

- `POST /doctor`

   Adds a new doctor to the system.

- `GET /doctor/{docId}/appointments`

   Retrieves all appointments for a specific doctor.

### PatientController

This controller is responsible for handling patient-related endpoints.

#### Endpoints:

- `POST /patient/signup`

   Registers a new patient by creating a new account.

- `POST /patient/signin`

   Logs in an existing patient.

- `GET /patient/doctors`

   Retrieves a list of all doctors for the authenticated patient.

- `DELETE /patient/appointment`

   Cancels an appointment for the authenticated patient.

## Data Transfer Objects (DTOs)

- `SignInInput`: Represents the input data for the patient sign-in operation.
- `SignInOutput`: Represents the output data for the patient sign-in operation.
- `SignUpInput`: Represents the input data for the patient sign-up operation.
- `SignUpOutput`: Represents the output data for the patient sign-up operation.

## Models

- `Appointment`: Represents an appointment entity with a composite key (`AppointmentKey`), doctor, and patient.
- `AppointmentKey`: Represents the composite key for an appointment.
- `AuthenticationToken`: Represents an authentication token for a patient.
- `Doctor`: Represents a doctor entity with a unique ID, name, specialization, and appointments.
- `Patient`: Represents a patient entity with a unique ID, name, email, password, contact information, and appointments.
- `Specialization`: Enum that represents different specializations for doctors.

## Repositories

- `IAppointmentRepo`: Repository interface for managing appointments.
- `IDoctorRepo`: Repository interface for managing doctors.
- `IPatientRepo`: Repository interface for managing patients.
- `ITokenRepo`: Repository interface for managing authentication tokens.

## Services

- `AppointmentService`: Service class for managing appointments.
- `AuthenticationService`: Service class for managing authentication tokens.
- `DoctorService`: Service class for managing doctors.
- `PatientService`: Service class for managing patients.


## Controllers

### AppointmentController

- **`bookAppointment(Appointment appointment)`**: POST method that books an appointment by calling the `bookAppointment` method of `AppointmentService`.

### DoctorController

- **`addDoctors(Doctor doc)`**: POST method that adds a new doctor by calling the `addDoc` method of `DoctorService`.
- **`getDocMyAppointments(Long docId)`**: GET method that retrieves a list of appointments for a specific doctor by calling the `getMyAppointments` method of `DoctorService`.

### PatientController

- **`signup(SignUpInput signUpDto)`**: POST method that handles patient signup by calling the `signUp` method of `PatientService`.
- **`signin(SignInInput signInDto)`**: POST method that handles patient signin by calling the `signIn` method of `PatientService`.
- **`getAllDoctors(String userEmail, String token)`**: GET method that retrieves a list of all doctors by calling the `getAllDoctors` method of `PatientService`.
- **`cancelAppointment(String userEmail, String token, AppointmentKey key)`**: DELETE method that cancels a patient's appointment by calling the `cancelAppointment` method of `PatientService`.

## DTOs (Data Transfer Objects)

### SignInInput

- **Fields**: `patientEmail`, `patientPassword`

### SignInOutput

- **Fields**: `status`, `token`

### SignUpInput

- **Fields**: `userFirstName`, `userLastName`, `userEmail`, `userPassword`, `userContact`

### SignUpOutput

- **Fields**: `status`, `message`

## Models

### Appointment

- **Fields**: `id` (AppointmentKey), `doctor` (Doctor), `patient` (Patient)

### AppointmentKey

- **Fields**: `appId` (Long), `time` (LocalDateTime)

### AuthenticationToken

- **Fields**: `tokenId` (Long), `token` (String), `tokenCreationDate` (LocalDate), `patient` (Patient)

### Doctor

- **Fields**: `doctorId` (Long), `doctorName` (String), `specialization` (Specialization), `appointments` (List of Appointment)

### Patient

- **Fields**: `patientId` (Long), `patientFirstName` (String), `patientLastName` (String), `patientEmail` (String), `patientPassword` (String), `patientContact` (String)

### Specialization

- **Values**: `ENT`, `ORTHO`, `GYNO`, `NEURO`, `DERMO`

## Repositories

### IAppointmentRepo

- **`findByIdAppId(Long id)`**: Retrieves the appointment ID by its ID.

### IDoctorRepo

- **`findByDoctorId(Long docId)`**: Retrieves a doctor by their ID.

### IPatientRepo

- **`findFirstByPatientEmail(String userEmail)`**: Retrieves a patient by their email.

### ITokenRepo

- **`findByPatient(Patient patient)`**: Retrieves an authentication token by the associated patient.
- **`findFirstByToken(String token)`**: Retrieves an authentication token by the token string.

## Services

### AppointmentService

- **`bookAppointment(Appointment appointment)`**: Books an appointment by saving it in the repository.
- **`cancelAppointment(AppointmentKey key)`**: Cancels an appointment by deleting it from the repository.

### AuthenticationService

- **`generateToken(Patient patient)`**: Generates an authentication token for a patient.
- **`validateToken(String token)`**: Validates an authentication token.

### DoctorService

- **`addDoc(Doctor doc)`**: Adds a doctor to the system by saving them in the repository.
- **`getMyAppointments(Long docId)`**: Retrieves a list of appointments for a specific doctor.

### PatientService

- **`signUp(SignUpInput signUpDto)`**: Handles patient signup by creating a new patient account.
- **`signIn(SignInInput signInDto)`**: Handles patient signin by verifying the credentials and generating an authentication token.
- **`getAllDoctors()`**: Retrieves a list of all doctors.
- **`cancelAppointment(String userEmail, AppointmentKey key)`**: Cancels a patient's appointment.

## License
This project is licensed under the [MIT License](LICENSE).

## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/muscularcardinal99/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/LoneWolf_ak99)


## Feedback

If you have any feedback, please reach out to us at kushwaha.abhishek1999@gmail.com