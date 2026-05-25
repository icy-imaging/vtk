// java wrapper for vtkRenderbuffer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderbuffer extends vtkObject
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

  private native boolean IsSupported_4(vtkRenderWindow id0);
  public boolean IsSupported(vtkRenderWindow id0)
  {
    return IsSupported_4(id0);
  }

  private native int GetHandle_5();
  public int GetHandle()
  {
    return GetHandle_5();
  }

  private native void SetContext_6(vtkRenderWindow id0);
  public void SetContext(vtkRenderWindow id0)
  {
    SetContext_6(id0);
  }

  private native long GetContext_7();
  public vtkRenderWindow GetContext()
  {
    long temp = GetContext_7();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CreateColorAttachment_8(int id0,int id1);
  public int CreateColorAttachment(int id0,int id1)
  {
    return CreateColorAttachment_8(id0,id1);
  }

  private native int CreateDepthAttachment_9(int id0,int id1);
  public int CreateDepthAttachment(int id0,int id1)
  {
    return CreateDepthAttachment_9(id0,id1);
  }

  private native int Create_10(int id0,int id1,int id2);
  public int Create(int id0,int id1,int id2)
  {
    return Create_10(id0,id1,id2);
  }

  private native int Create_11(int id0,int id1,int id2,int id3);
  public int Create(int id0,int id1,int id2,int id3)
  {
    return Create_11(id0,id1,id2,id3);
  }

  private native void ReleaseGraphicsResources_12(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_12(id0);
  }

  private native void Resize_13(int id0,int id1);
  public void Resize(int id0,int id1)
  {
    Resize_13(id0,id1);
  }

  private native int GetWidth_14();
  public int GetWidth()
  {
    return GetWidth_14();
  }

  private native int GetHeight_15();
  public int GetHeight()
  {
    return GetHeight_15();
  }

  private native int GetSamples_16();
  public int GetSamples()
  {
    return GetSamples_16();
  }

  public vtkRenderbuffer() { super(); }

  public vtkRenderbuffer(long id) { super(id); }
  public native long   VTKInit();

}
