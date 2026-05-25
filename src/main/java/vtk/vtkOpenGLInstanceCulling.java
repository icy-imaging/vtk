// java wrapper for vtkOpenGLInstanceCulling object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLInstanceCulling extends vtkObject
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

  private native void InitLOD_4(vtkPolyData id0);
  public void InitLOD(vtkPolyData id0)
  {
    InitLOD_4(id0);
  }

  private native void AddLOD_5(float id0,float id1);
  public void AddLOD(float id0,float id1)
  {
    AddLOD_5(id0,id1);
  }

  private native void BuildCullingShaders_6(vtkOpenGLShaderCache id0,long id1,boolean id2);
  public void BuildCullingShaders(vtkOpenGLShaderCache id0,long id1,boolean id2)
  {
    BuildCullingShaders_6(id0,id1,id2);
  }

  private native long GetNumberOfLOD_7();
  public long GetNumberOfLOD()
  {
    return GetNumberOfLOD_7();
  }

  private native long GetLODBuffer_8(long id0);
  public vtkOpenGLBufferObject GetLODBuffer(long id0)
  {
    long temp = GetLODBuffer_8(id0);

    if (temp == 0) return null;
    return (vtkOpenGLBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RunCullingShaders_9(long id0,vtkOpenGLBufferObject id1,vtkOpenGLBufferObject id2,vtkOpenGLBufferObject id3);
  public void RunCullingShaders(long id0,vtkOpenGLBufferObject id1,vtkOpenGLBufferObject id2,vtkOpenGLBufferObject id3)
  {
    RunCullingShaders_9(id0,id1,id2,id3);
  }

  private native void SetColorLOD_10(boolean id0);
  public void SetColorLOD(boolean id0)
  {
    SetColorLOD_10(id0);
  }

  private native boolean GetColorLOD_11();
  public boolean GetColorLOD()
  {
    return GetColorLOD_11();
  }

  public vtkOpenGLInstanceCulling() { super(); }

  public vtkOpenGLInstanceCulling(long id) { super(id); }
  public native long   VTKInit();

}
