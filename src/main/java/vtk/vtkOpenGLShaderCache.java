// java wrapper for vtkOpenGLShaderCache object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLShaderCache extends vtkObject
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

  private native void SetSyncGLSLShaderVersion_4(boolean id0);
  public void SetSyncGLSLShaderVersion(boolean id0)
  {
    SetSyncGLSLShaderVersion_4(id0);
  }

  private native boolean GetSyncGLSLShaderVersion_5();
  public boolean GetSyncGLSLShaderVersion()
  {
    return GetSyncGLSLShaderVersion_5();
  }

  private native void SyncGLSLShaderVersionOn_6();
  public void SyncGLSLShaderVersionOn()
  {
    SyncGLSLShaderVersionOn_6();
  }

  private native void SyncGLSLShaderVersionOff_7();
  public void SyncGLSLShaderVersionOff()
  {
    SyncGLSLShaderVersionOff_7();
  }

  private native long ReadyShaderProgram_8(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,vtkTransformFeedback id3);
  public vtkShaderProgram ReadyShaderProgram(String id0,String id1,String id2,vtkTransformFeedback id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    long temp = ReadyShaderProgram_8(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,id3);

    if (temp == 0) return null;
    return (vtkShaderProgram)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ReadyShaderProgram_9(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3,byte[] id4, int len4,vtkTransformFeedback id5);
  public vtkShaderProgram ReadyShaderProgram(String id0,String id1,String id2,String id3,String id4,vtkTransformFeedback id5)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    long temp = ReadyShaderProgram_9(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length,bytes4, bytes4.length,id5);

    if (temp == 0) return null;
    return (vtkShaderProgram)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ReadyShaderProgram_10(vtkShaderProgram id0,vtkTransformFeedback id1);
  public vtkShaderProgram ReadyShaderProgram(vtkShaderProgram id0,vtkTransformFeedback id1)
  {
    long temp = ReadyShaderProgram_10(id0,id1);

    if (temp == 0) return null;
    return (vtkShaderProgram)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReleaseCurrentShader_11();
  public void ReleaseCurrentShader()
  {
    ReleaseCurrentShader_11();
  }

  private native void ReleaseGraphicsResources_12(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_12(id0);
  }

  private native void ClearLastShaderBound_13();
  public void ClearLastShaderBound()
  {
    ClearLastShaderBound_13();
  }

  private native long GetLastShaderBound_14();
  public vtkShaderProgram GetLastShaderBound()
  {
    long temp = GetLastShaderBound_14();

    if (temp == 0) return null;
    return (vtkShaderProgram)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetElapsedTime_15(float id0);
  public void SetElapsedTime(float id0)
  {
    SetElapsedTime_15(id0);
  }

  public vtkOpenGLShaderCache() { super(); }

  public vtkOpenGLShaderCache(long id) { super(id); }
  public native long   VTKInit();

}
