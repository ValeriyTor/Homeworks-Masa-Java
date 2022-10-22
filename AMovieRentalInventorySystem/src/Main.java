public class Main {
    public static void main(String[] args) {
        VideoStore videoCatalog = new VideoStore();
        // добавление фильмов в список
        videoCatalog.addVideo("The Matrix");
        videoCatalog.addVideo("Godfather II");
        videoCatalog.addVideo("Star Wars Episode IV: A New Hope");
        // установка рейтинга фильмов
        videoCatalog.receiveRating("The Matrix", 4.3);
        videoCatalog.receiveRating("Godfather II", 4.8);
        videoCatalog.receiveRating("Godfather II", 1.8);
        videoCatalog.receiveRating("Star Wars Episode IV: A New Hope", 4.1);
        // взяли каждое видео один раз
        videoCatalog.checkOutVideo("The Matrix");
        videoCatalog.checkOutVideo("Godfather II");
        videoCatalog.checkOutVideo("Star Wars Episode IV: A New Hope");
        // вернули 2 фильма
        videoCatalog.returnVideo("The Matrix");
        videoCatalog.returnVideo("Godfather II");
        // вызов информации о фильмах
        videoCatalog.listInventory();

    }
}


class Video {
    String title = "";
    boolean flag = false;
    double rating = 0;
    //double ratingSum = 0;
    int ratingUsers = 0;
    double ratingPercent = 0;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    public void checkOut() {
        this.flag = true;
    }
    public void returned() {
        this.flag = false;
    }
    public boolean getCheckOut() {
         return this.flag;
    }

    public void setRating(double rating) {
        this.rating = rating + this.rating;
        this.ratingUsers = ratingUsers + 1;
        this.ratingPercent = this.rating / this.ratingUsers;
    }
    public double getRating() {
        return this.ratingPercent;
    }

}

class VideoStore {
    int countVideos = 10;
    Video[] videos = new Video[countVideos];
    int videoCount = 0;

    void addVideo(String title) {
        videos[videoCount] = new Video();
        videos[videoCount].setTitle(title);
            videoCount++;
        }

    void checkOutVideo(String title)
    {
        for (int i = 0 ; i < videoCount ; i++)
        if (videos[i].title.equals(title))
        videos[i].checkOut();
    }

    public void returnVideo(String title) {
        for (int i = 0 ; i < videoCount ; i++)
            if (videos[i].title.equals(title))
                videos[i].returned();
    }

    public void receiveRating(String title, double rating) {
        for (int i = 0 ; i < videoCount ; i++)
            if (videos[i].title.equals(title))
                videos[i].setRating(rating);
    }

    public void listInventory() {
        for (int i = 0; i < videoCount; i++) {
            System.out.println("Movie: " + videos[i].getTitle());
            System.out.println(" Rating:" + videos[i].getRating());
            if (videos[i].getCheckOut()) {
                System.out.println(" Checked out: Yes");
            } else {
                System.out.println(" Checked out: No");
            }
        }
    }
}