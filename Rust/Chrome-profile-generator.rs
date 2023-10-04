use std::process::{Command, Stdio};
use std::thread;
use webdriver::prelude::*;
use webdriver::chrome::ChromeOptions;

fn main() -> Result<(), Box<dyn std::error::Error>> {
    // Loop to create 100 profiles
    for i in 1..=100 {
        // Generate a unique profile directory for each profile
        let profile_dir = format!("/path/to/profile{}", i);

        // Spawn a new Chrome process with a custom user data directory
        let mut chrome_cmd = Command::new("google-chrome");
        chrome_cmd
            .arg("--user-data-dir=".to_owned() + &profile_dir)
            .stdout(Stdio::null())
            .stderr(Stdio::null())
            .spawn()
            .expect("Failed to start Chrome process");

        // Give some time for the profile to be created
        thread::sleep(std::time::Duration::from_secs(5));

        println!("Created profile {}", i);
    }

    Ok(())
}
