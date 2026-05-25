// java wrapper for vtkOpenGLVertexBufferObjectGroup object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLVertexBufferObjectGroup extends vtkObject
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

  private native int GetNumberOfComponents_4(byte[] id0, int len0);
  public int GetNumberOfComponents(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfComponents_4(bytes0, bytes0.length);
  }

  private native int GetNumberOfTuples_5(byte[] id0, int len0);
  public int GetNumberOfTuples(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfTuples_5(bytes0, bytes0.length);
  }

  private native void ReleaseGraphicsResources_6(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_6(id0);
  }

  private native long GetVBO_7(byte[] id0, int len0);
  public vtkOpenGLVertexBufferObject GetVBO(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetVBO_7(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkOpenGLVertexBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddAllAttributesToVAO_8(vtkShaderProgram id0,vtkOpenGLVertexArrayObject id1);
  public void AddAllAttributesToVAO(vtkShaderProgram id0,vtkOpenGLVertexArrayObject id1)
  {
    AddAllAttributesToVAO_8(id0,id1);
  }

  private native void RemoveAttribute_9(byte[] id0, int len0);
  public void RemoveAttribute(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveAttribute_9(bytes0, bytes0.length);
  }

  private native void CacheDataArray_10(byte[] id0, int len0,vtkDataArray id1,vtkOpenGLVertexBufferObjectCache id2,int id3);
  public void CacheDataArray(String id0,vtkDataArray id1,vtkOpenGLVertexBufferObjectCache id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    CacheDataArray_10(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void CacheDataArray_11(byte[] id0, int len0,vtkDataArray id1,vtkViewport id2,int id3);
  public void CacheDataArray(String id0,vtkDataArray id1,vtkViewport id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    CacheDataArray_11(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void AppendDataArray_12(byte[] id0, int len0,vtkDataArray id1,int id2);
  public void AppendDataArray(String id0,vtkDataArray id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AppendDataArray_12(bytes0, bytes0.length,id1,id2);
  }

  private native void BuildAllVBOs_13(vtkOpenGLVertexBufferObjectCache id0);
  public void BuildAllVBOs(vtkOpenGLVertexBufferObjectCache id0)
  {
    BuildAllVBOs_13(id0);
  }

  private native void BuildAllVBOs_14(vtkViewport id0);
  public void BuildAllVBOs(vtkViewport id0)
  {
    BuildAllVBOs_14(id0);
  }

  private native void ClearAllVBOs_15();
  public void ClearAllVBOs()
  {
    ClearAllVBOs_15();
  }

  private native void ClearAllDataArrays_16();
  public void ClearAllDataArrays()
  {
    ClearAllDataArrays_16();
  }

  private native long GetMTime_17();
  public long GetMTime()
  {
    return GetMTime_17();
  }

  public vtkOpenGLVertexBufferObjectGroup() { super(); }

  public vtkOpenGLVertexBufferObjectGroup(long id) { super(id); }
  public native long   VTKInit();

}
