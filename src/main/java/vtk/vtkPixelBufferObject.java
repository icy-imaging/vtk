// java wrapper for vtkPixelBufferObject object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPixelBufferObject extends vtkObject
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

  private native void SetContext_4(vtkRenderWindow id0);
  public void SetContext(vtkRenderWindow id0)
  {
    SetContext_4(id0);
  }

  private native long GetContext_5();
  public vtkRenderWindow GetContext()
  {
    long temp = GetContext_5();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetUsage_6();
  public int GetUsage()
  {
    return GetUsage_6();
  }

  private native void SetUsage_7(int id0);
  public void SetUsage(int id0)
  {
    SetUsage_7(id0);
  }

  private native int GetType_8();
  public int GetType()
  {
    return GetType_8();
  }

  private native void SetType_9(int id0);
  public void SetType(int id0)
  {
    SetType_9(id0);
  }

  private native int GetComponents_10();
  public int GetComponents()
  {
    return GetComponents_10();
  }

  private native void SetComponents_11(int id0);
  public void SetComponents(int id0)
  {
    SetComponents_11(id0);
  }

  private native int GetSize_12();
  public int GetSize()
  {
    return GetSize_12();
  }

  private native void SetSize_13(int id0);
  public void SetSize(int id0)
  {
    SetSize_13(id0);
  }

  private native void SetSize_14(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_14(id0,id1);
  }

  private native int GetHandle_15();
  public int GetHandle()
  {
    return GetHandle_15();
  }

  private native void BindToPackedBuffer_16();
  public void BindToPackedBuffer()
  {
    BindToPackedBuffer_16();
  }

  private native void BindToUnPackedBuffer_17();
  public void BindToUnPackedBuffer()
  {
    BindToUnPackedBuffer_17();
  }

  private native void UnBind_18();
  public void UnBind()
  {
    UnBind_18();
  }

  private native void UnmapUnpackedBuffer_19();
  public void UnmapUnpackedBuffer()
  {
    UnmapUnpackedBuffer_19();
  }

  private native void UnmapPackedBuffer_20();
  public void UnmapPackedBuffer()
  {
    UnmapPackedBuffer_20();
  }

  private native void Bind_21(int id0);
  public void Bind(int id0)
  {
    Bind_21(id0);
  }

  private native void UnmapBuffer_22(int id0);
  public void UnmapBuffer(int id0)
  {
    UnmapBuffer_22(id0);
  }

  private native void Allocate_23(int id0,int id1,int id2,int id3);
  public void Allocate(int id0,int id1,int id2,int id3)
  {
    Allocate_23(id0,id1,id2,id3);
  }

  private native void Allocate_24(int id0,int id1);
  public void Allocate(int id0,int id1)
  {
    Allocate_24(id0,id1);
  }

  private native void ReleaseMemory_25();
  public void ReleaseMemory()
  {
    ReleaseMemory_25();
  }

  private native boolean IsSupported_26(vtkRenderWindow id0);
  public boolean IsSupported(vtkRenderWindow id0)
  {
    return IsSupported_26(id0);
  }

  public vtkPixelBufferObject() { super(); }

  public vtkPixelBufferObject(long id) { super(id); }
  public native long   VTKInit();

}
