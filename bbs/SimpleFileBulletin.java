package kr.hs.dgsw.c2.bbs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleFileBulletin implements Bulletin {
    private static final String PATH = "C:\\Thread\\hello.txt";
    private File file;
    private int pool = 0;

    public SimpleFileBulletin() {
        this.file = new File(PATH);
        if (!this.file.exists()) {
            try {
                this.file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void write(Writing writing) {
        pool++;
        writing.setIndex(pool);
        try {
            PrintWriter out = new PrintWriter(new FileWriter(this.file, true));
            String line = writing.getIndex() + "-" + writing.getTitle() + "-" + writing.getContent() + "-" + writing.getWriter() + "-\\";
            out.println(line);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Writing writing) {

    }

    @Override
    public Writing read(int index) {
        List<Writing> result = list();
        if (result != null) {
            for (Writing writing : result) {
                if (writing.getIndex() == index) {
                    return writing;
                }
            }
        }
        return null;
    }

    @Override
    public List<Writing> list() {
        List <Writing> result = new ArrayList<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(this.file));
            String line = null;
            while ((line = in.readLine()) != null) {
                Writing writing = new Writing();
                int current = 0;
                int last = 0;

                for(int i = 0; i < line.length(); i++){
                    if(line.charAt(i) == '-' && current == 0) {
                        int index = Integer.parseInt(line.substring(0, i));
                        writing.setIndex(index);
                        last = i;
                        current++;
                    } else if (line.charAt(i) == '-' && current == 1) {
                        String title = line.substring(last + 1, i);
                        writing.setTitle(title);
                        last = i;
                        current++;
                    } else if(line.charAt(i) == '-' && current == 2) {
                        String content = line.substring(last + 1, i);
                        writing.setContent(content);
                        last = i;
                        current++;
                    } else if(line.charAt(i) == '-' && current == 3) {
                        String writer = line.substring(last + 1, i);
                        writing.setWriter(writer);
                        last = i;
                        current++;
                    } else if(line.charAt(i) == '\\') {
                        break;
                    }
                }
                result.add(writing);
            }
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}

