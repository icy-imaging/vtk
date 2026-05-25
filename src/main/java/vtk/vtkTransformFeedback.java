// java wrapper for vtkTransformFeedback object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTransformFeedback extends vtkObject
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

  private native void ClearVaryings_4();
  public void ClearVaryings()
  {
    ClearVaryings_4();
  }

  private native void AddVarying_5(int id0,byte[] id1, int len1);
  public void AddVarying(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddVarying_5(id0,bytes1, bytes1.length);
  }

  private native void BindVaryings_6(vtkShaderProgram id0);
  public void BindVaryings(vtkShaderProgram id0)
  {
    BindVaryings_6(id0);
  }

  private native long GetBuffer_7(int id0);
  public vtkOpenGLBufferObject GetBuffer(int id0)
  {
    long temp = GetBuffer_7(id0);

    if (temp == 0) return null;
    return (vtkOpenGLBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetBufferHandle_8(int id0);
  public int GetBufferHandle(int id0)
  {
    return GetBufferHandle_8(id0);
  }

  private native void SetPrimitiveMode_9(int id0);
  public void SetPrimitiveMode(int id0)
  {
    SetPrimitiveMode_9(id0);
  }

  private native int GetPrimitiveMode_10();
  public int GetPrimitiveMode()
  {
    return GetPrimitiveMode_10();
  }

  private native void BindBuffer_11(boolean id0);
  public void BindBuffer(boolean id0)
  {
    BindBuffer_11(id0);
  }

  private native void ReadBuffer_12(int id0);
  public void ReadBuffer(int id0)
  {
    ReadBuffer_12(id0);
  }

  private native void ReleaseGraphicsResources_13();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_13();
  }

  private native void ReleaseBufferData_14(boolean id0);
  public void ReleaseBufferData(boolean id0)
  {
    ReleaseBufferData_14(id0);
  }

  public vtkTransformFeedback() { super(); }

  public vtkTransformFeedback(long id) { super(id); }
  public native long   VTKInit();

}
