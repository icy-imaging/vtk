// java wrapper for vtkGLSLModifierBase object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGLSLModifierBase extends vtkObject
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

  private native void SetPrimitiveType_4(int id0);
  public void SetPrimitiveType(int id0)
  {
    SetPrimitiveType_4(id0);
  }

  private native boolean ReplaceShaderValues_5(vtkOpenGLRenderer id0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3,byte[] id4, int len4,byte[] id5, int len5,vtkAbstractMapper id6,vtkActor id7);
  public boolean ReplaceShaderValues(vtkOpenGLRenderer id0,String id1,String id2,String id3,String id4,String id5,vtkAbstractMapper id6,vtkActor id7)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    byte[] bytes5 = id5.getBytes(StandardCharsets.UTF_8);
    return ReplaceShaderValues_5(id0,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length,bytes4, bytes4.length,bytes5, bytes5.length,id6,id7);
  }

  private native boolean SetShaderParameters_6(vtkOpenGLRenderer id0,vtkShaderProgram id1,vtkAbstractMapper id2,vtkActor id3,vtkOpenGLVertexArrayObject id4);
  public boolean SetShaderParameters(vtkOpenGLRenderer id0,vtkShaderProgram id1,vtkAbstractMapper id2,vtkActor id3,vtkOpenGLVertexArrayObject id4)
  {
    return SetShaderParameters_6(id0,id1,id2,id3,id4);
  }

  private native boolean IsUpToDate_7(vtkOpenGLRenderer id0,vtkAbstractMapper id1,vtkActor id2);
  public boolean IsUpToDate(vtkOpenGLRenderer id0,vtkAbstractMapper id1,vtkActor id2)
  {
    return IsUpToDate_7(id0,id1,id2);
  }

  private native long GLSL_MODIFIERS_8();
  public vtkInformationObjectBaseKey GLSL_MODIFIERS()
  {
    long temp = GLSL_MODIFIERS_8();

    if (temp == 0) return null;
    return (vtkInformationObjectBaseKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGLSLModifierBase() { super(); }

  public vtkGLSLModifierBase(long id) { super(id); }

}
