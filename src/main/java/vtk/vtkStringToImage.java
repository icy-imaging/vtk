// java wrapper for vtkStringToImage object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStringToImage extends vtkObject
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native int RenderString_4(vtkTextProperty id0,byte[] id1, int len1,int id2,vtkImageData id3,int id4[]);
  public int RenderString(vtkTextProperty id0,String id1,int id2,vtkImageData id3,int id4[])
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return RenderString_4(id0,bytes1, bytes1.length,id2,id3,id4);
  }

  private native void SetScaleToPowerOfTwo_5(boolean id0);
  public void SetScaleToPowerOfTwo(boolean id0)
  {
    SetScaleToPowerOfTwo_5(id0);
  }

  private native boolean GetScaleToPowerOfTwo_6();
  public boolean GetScaleToPowerOfTwo()
  {
    return GetScaleToPowerOfTwo_6();
  }

  public vtkStringToImage() { super(); }

  public vtkStringToImage(long id) { super(id); }

}
