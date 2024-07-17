public class time {
    public static void main(String[] args) {
        String[] tym= {
                "01:00:00AM",
                "02:15:30AM",
                "03:34:56AM",
                "04:45:45AM",
                "05:59:59AM",
                "06:10:10AM",
                "07:20:20AM",
                "08:30:30AM",
                "09:40:40AM",
                "10:50:50AM",
                "11:55:55AM",
                "12:00:00PM",
                "01:10:10PM",
                "02:20:20PM",
                "03:34:56PM",
                "04:45:45PM",
                "05:59:59PM",
                "06:10:10PM",
                "07:20:20PM",
                "08:30:30PM",
                "09:40:40PM",
                "10:50:50PM",
                "11:55:55PM",
                "12:00:00AM"
        };
        for (String s : tym) {
            String type = s.substring(8, 10);
            if (type.equals("AM")) {
                if (s.substring(0, 2).equals("12"))
                    System.out.println("00" + s.substring(2, 8));
                else
                    System.out.println(s.substring(0, 8));
            } else {
                if(s.substring(0,2).equals("12"))
                    System.out.println(s.substring(0,8));
                else
                {
                    int hr = Integer.parseInt(s.substring(0, 2));
                    hr += 12;
                    System.out.println(String.valueOf(hr) + s.substring(2, 8));
                }
            }

        }
    }
}
