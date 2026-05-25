// java wrapper for vtkOpenGLVertexArrayObject object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLVertexArrayObject extends vtkObject
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

  private native void Bind_4();
  public void Bind()
  {
    Bind_4();
  }

  private native void Release_5();
  public void Release()
  {
    Release_5();
  }

  private native void ReleaseGraphicsResources_6();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_6();
  }

  private native void ShaderProgramChanged_7();
  public void ShaderProgramChanged()
  {
    ShaderProgramChanged_7();
  }

  private native boolean AddAttributeArray_8(vtkShaderProgram id0,vtkOpenGLVertexBufferObject id1,byte[] id2, int len2,int id3,boolean id4);
  public boolean AddAttributeArray(vtkShaderProgram id0,vtkOpenGLVertexBufferObject id1,String id2,int id3,boolean id4)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return AddAttributeArray_8(id0,id1,bytes2, bytes2.length,id3,id4);
  }

  private native boolean RemoveAttributeArray_9(byte[] id0, int len0);
  public boolean RemoveAttributeArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return RemoveAttributeArray_9(bytes0, bytes0.length);
  }

  private native void SetForceEmulation_10(boolean id0);
  public void SetForceEmulation(boolean id0)
  {
    SetForceEmulation_10(id0);
  }

  public vtkOpenGLVertexArrayObject() { super(); }

  public vtkOpenGLVertexArrayObject(long id) { super(id); }
  public native long   VTKInit();

}
