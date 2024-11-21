import axios from "axios";
import z from "zod";
import React from "react";
import { Link } from "react-router-dom";
import { SubmitHandler, useForm } from "react-hook-form";
import { zodResolver } from "@hookform/resolvers/zod";

const schema = z.object({
  title: z.string(),
  body: z.string(),
});

type FormType = z.infer<typeof schema>;
const Post: React.FC = () => {
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm<FormType>({
    resolver: zodResolver(schema),
  });

  const onSubmit: SubmitHandler<FormType> = async (data) => {
    console.log("post data", data);
    try {
      await axios.post("http://localhost:8080/api/create", data);
      console.log("Post created successfully!");
    } catch (error) {
      console.error("Error creating post: ", error);
    }
  };
  return (
    <>
      <h1 className="text-2xl ml-6">Post page</h1>
      <div className="w-72 ml-6">
        <form onSubmit={handleSubmit(onSubmit)}>
          <div>
            <label htmlFor="title">Title:</label>
            <input
              id="title"
              type="text"
              {...register("title")}
              className={`border w-full py-2 px-4 ${errors.title ? "border-red-400" : ""}`}
            />
            {/* {errors.title && <p className="text-red-400">{errors.title?.message}</p>} */}
          </div>
          <div>
            <label htmlFor="body">Body:</label>
            <textarea
              id="body"
              {...register("body")}
              className={`border w-full py-2 px-4 ${errors.body ? "border-red-400" : ""}`}
            />
            {/* {errors.body && <p className="text-red-400">{errors.body.message}</p>} */}
          </div>
          <button type="submit" className="border px-2 border-blue-400 ">
            Submit
          </button>
        </form>

        <button className="border px-2 border-blue-400 mt-3">
          <Link to="/">Go Home</Link>
        </button>
      </div>
    </>
  );
};

export default Post;
