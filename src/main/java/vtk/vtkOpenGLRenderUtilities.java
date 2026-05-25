// java wrapper for vtkOpenGLRenderUtilities object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLRenderUtilities extends vtkObject
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

  private native byte[] GetFullScreenQuadVertexShader_4();
  public String GetFullScreenQuadVertexShader()
  {
    return new String(GetFullScreenQuadVertexShader_4(), StandardCharsets.UTF_8);
  }

  private native byte[] GetFullScreenQuadFragmentShaderTemplate_5();
  public String GetFullScreenQuadFragmentShaderTemplate()
  {
    return new String(GetFullScreenQuadFragmentShaderTemplate_5(), StandardCharsets.UTF_8);
  }

  private native byte[] GetFullScreenQuadGeometryShader_6();
  public String GetFullScreenQuadGeometryShader()
  {
    return new String(GetFullScreenQuadGeometryShader_6(), StandardCharsets.UTF_8);
  }

  private native boolean PrepFullScreenVAO_7(vtkOpenGLRenderWindow id0,vtkOpenGLVertexArrayObject id1,vtkShaderProgram id2);
  public boolean PrepFullScreenVAO(vtkOpenGLRenderWindow id0,vtkOpenGLVertexArrayObject id1,vtkShaderProgram id2)
  {
    return PrepFullScreenVAO_7(id0,id1,id2);
  }

  private native void DrawFullScreenQuad_8();
  public void DrawFullScreenQuad()
  {
    DrawFullScreenQuad_8();
  }

  private native boolean PrepFullScreenVAO_9(vtkOpenGLBufferObject id0,vtkOpenGLVertexArrayObject id1,vtkShaderProgram id2);
  public boolean PrepFullScreenVAO(vtkOpenGLBufferObject id0,vtkOpenGLVertexArrayObject id1,vtkShaderProgram id2)
  {
    return PrepFullScreenVAO_9(id0,id1,id2);
  }

  private native void MarkDebugEvent_10(byte[] id0, int len0);
  public void MarkDebugEvent(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    MarkDebugEvent_10(bytes0, bytes0.length);
  }

  public vtkOpenGLRenderUtilities() { super(); }

  public vtkOpenGLRenderUtilities(long id) { super(id); }

}
