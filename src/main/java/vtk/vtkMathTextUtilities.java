// java wrapper for vtkMathTextUtilities object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMathTextUtilities extends vtkObject
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

  private native boolean IsAvailable_4();
  public boolean IsAvailable()
  {
    return IsAvailable_4();
  }

  private native long GetInstance_5();
  public vtkMathTextUtilities GetInstance()
  {
    long temp = GetInstance_5();

    if (temp == 0) return null;
    return (vtkMathTextUtilities)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInstance_6(vtkMathTextUtilities id0);
  public void SetInstance(vtkMathTextUtilities id0)
  {
    SetInstance_6(id0);
  }

  private native boolean GetBoundingBox_7(vtkTextProperty id0,byte[] id1, int len1,int id2,int id3[]);
  public boolean GetBoundingBox(vtkTextProperty id0,String id1,int id2,int id3[])
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetBoundingBox_7(id0,bytes1, bytes1.length,id2,id3);
  }

  private native boolean RenderString_8(byte[] id0, int len0,vtkImageData id1,vtkTextProperty id2,int id3,int id4[]);
  public boolean RenderString(String id0,vtkImageData id1,vtkTextProperty id2,int id3,int id4[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return RenderString_8(bytes0, bytes0.length,id1,id2,id3,id4);
  }

  private native boolean StringToPath_9(byte[] id0, int len0,vtkPath id1,vtkTextProperty id2,int id3);
  public boolean StringToPath(String id0,vtkPath id1,vtkTextProperty id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return StringToPath_9(bytes0, bytes0.length,id1,id2,id3);
  }

  private native int GetConstrainedFontSize_10(byte[] id0, int len0,vtkTextProperty id1,int id2,int id3,int id4);
  public int GetConstrainedFontSize(String id0,vtkTextProperty id1,int id2,int id3,int id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetConstrainedFontSize_10(bytes0, bytes0.length,id1,id2,id3,id4);
  }

  private native boolean GetScaleToPowerOfTwo_11();
  public boolean GetScaleToPowerOfTwo()
  {
    return GetScaleToPowerOfTwo_11();
  }

  private native void SetScaleToPowerOfTwo_12(boolean id0);
  public void SetScaleToPowerOfTwo(boolean id0)
  {
    SetScaleToPowerOfTwo_12(id0);
  }

  public vtkMathTextUtilities() { super(); }

  public vtkMathTextUtilities(long id) { super(id); }
  public native long   VTKInit();

}
