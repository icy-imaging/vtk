// java wrapper for vtkTextRenderer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextRenderer extends vtkObject
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

  private native long GetInstance_4();
  public vtkTextRenderer GetInstance()
  {
    long temp = GetInstance_4();

    if (temp == 0) return null;
    return (vtkTextRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDefaultBackend_5(int id0);
  public void SetDefaultBackend(int id0)
  {
    SetDefaultBackend_5(id0);
  }

  private native int GetDefaultBackend_6();
  public int GetDefaultBackend()
  {
    return GetDefaultBackend_6();
  }

  private native int DetectBackend_7(byte[] id0, int len0);
  public int DetectBackend(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return DetectBackend_7(bytes0, bytes0.length);
  }

  private native boolean FreeTypeIsSupported_8();
  public boolean FreeTypeIsSupported()
  {
    return FreeTypeIsSupported_8();
  }

  private native boolean MathTextIsSupported_9();
  public boolean MathTextIsSupported()
  {
    return MathTextIsSupported_9();
  }

  private native boolean GetBoundingBox_10(vtkTextProperty id0,byte[] id1, int len1,int id2[],int id3,int id4);
  public boolean GetBoundingBox(vtkTextProperty id0,String id1,int id2[],int id3,int id4)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetBoundingBox_10(id0,bytes1, bytes1.length,id2,id3,id4);
  }

  private native boolean RenderString_11(vtkTextProperty id0,byte[] id1, int len1,vtkImageData id2,int id3[],int id4,int id5);
  public boolean RenderString(vtkTextProperty id0,String id1,vtkImageData id2,int id3[],int id4,int id5)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return RenderString_11(id0,bytes1, bytes1.length,id2,id3,id4,id5);
  }

  private native int GetConstrainedFontSize_12(byte[] id0, int len0,vtkTextProperty id1,int id2,int id3,int id4,int id5);
  public int GetConstrainedFontSize(String id0,vtkTextProperty id1,int id2,int id3,int id4,int id5)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetConstrainedFontSize_12(bytes0, bytes0.length,id1,id2,id3,id4,id5);
  }

  private native boolean StringToPath_13(vtkTextProperty id0,byte[] id1, int len1,vtkPath id2,int id3,int id4);
  public boolean StringToPath(vtkTextProperty id0,String id1,vtkPath id2,int id3,int id4)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return StringToPath_13(id0,bytes1, bytes1.length,id2,id3,id4);
  }

  private native void SetScaleToPowerOfTwo_14(boolean id0);
  public void SetScaleToPowerOfTwo(boolean id0)
  {
    SetScaleToPowerOfTwo_14(id0);
  }

  public vtkTextRenderer() { super(); }

  public vtkTextRenderer(long id) { super(id); }
  public native long   VTKInit();

}
