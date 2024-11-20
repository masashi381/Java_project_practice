import axios from "axios";
import React, { useEffect, useState } from "react";

type DataProps = {
  title: string;
  body: string;
};
const Home: React.FC = () => {
  const [fetchedData, setFetchedData] = useState<DataProps[]>([]);
  // const [data, setData] = useState<{ message: String } | null>(null);
  useEffect(() => {
    const getData = async () => {
      const res = await axios.get("http://localhost:8080/api/");
      console.log("res: ", res.data);
      // setData(res.data);
      setFetchedData(res.data);
    };
    getData();
  }, []);
  // console.log("data: ", data);

  console.log("data: ", fetchedData);
  return <>test</>;
  // return <div>{fetchedData ? <h2>title : {fetchedData.title}</h2> : null}</div>;
};

export default Home;
