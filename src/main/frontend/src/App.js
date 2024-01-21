import {useCallback, useEffect, useState} from "react";
import './App.css';
import axios from "axios";
import {useDropzone} from 'react-dropzone'

function App() {

    const UserProfiles = () => {
        const [userProfiles, setUserProfiles] = useState([]);
        const fetchUserProfiles = () => {
            axios.get("http://localhost:8080/api/v1/user-profile")
                .then(res => {
                    setUserProfiles(res.data)
                }).catch(err => {
                console.log(err);
            });
        };

        useEffect(() => {
            fetchUserProfiles();
        }, []);


        function Dropzone({userProfileId}) {
            const onDrop = useCallback(acceptedFiles => {
                const file = acceptedFiles[0];
                console.log(file);
                const formData = new FormData();
                formData.append("file", file);

                axios.post(
                    `http://localhost:8080/api/v1/user-profile/${userProfileId}/image/upload`,
                    formData,
                    {
                        headers: {
                            "Content-Type": "multipart/form-data"
                        }
                    }
                ).then(() => {
                    console.log("file uploaded successfully");
                }).catch(err => {
                    console.log(err)
                })
            }, [])
            const {getRootProps, getInputProps, isDragActive} = useDropzone({onDrop})

            return (
                <div className="Dropzone" {...getRootProps()}>
                    <input {...getInputProps()} />
                    {
                        isDragActive ?
                            <p>Drop the image here ...</p> :
                            <p>Drag 'n' drop profile image, or click to select profile image</p>
                    }
                </div>
            )
        }

        return userProfiles.map((userProfile, index) => {
            return (
                <div key={index} className="UserProfile">
                    {userProfile.userProfileId ?
                        <img
                            src={`http://localhost:8080/api/v1/user-profile/${userProfile.userProfileId}/image/download`}/> : null}
                    <br/>
                    <br/>
                    <h1>{userProfile.userName}</h1>
                    <p>{userProfile.userProfileId}</p>
                    <Dropzone {...userProfile}/>
                    <br/>
                </div>
            )
        });
    };

    return (
        <div className="App">
            <UserProfiles/>
        </div>
    );
}

export default App;
