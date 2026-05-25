// java wrapper for vtkOpenGLGL2PSHelperImpl object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLGL2PSHelperImpl extends vtkOpenGLGL2PSHelper
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

  private native void ProcessTransformFeedback_4(vtkTransformFeedback id0,vtkRenderer id1,vtkActor id2);
  public void ProcessTransformFeedback(vtkTransformFeedback id0,vtkRenderer id1,vtkActor id2)
  {
    ProcessTransformFeedback_4(id0,id1,id2);
  }

  private native void ProcessTransformFeedback_5(vtkTransformFeedback id0,vtkRenderer id1,float id2[]);
  public void ProcessTransformFeedback(vtkTransformFeedback id0,vtkRenderer id1,float id2[])
  {
    ProcessTransformFeedback_5(id0,id1,id2);
  }

  private native void DrawString_6(byte[] id0, int len0,vtkTextProperty id1,double id2[],double id3,vtkRenderer id4);
  public void DrawString(String id0,vtkTextProperty id1,double id2[],double id3,vtkRenderer id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DrawString_6(bytes0, bytes0.length,id1,id2,id3,id4);
  }

  private native void DrawImage_7(vtkImageData id0,double id1[]);
  public void DrawImage(vtkImageData id0,double id1[])
  {
    DrawImage_7(id0,id1);
  }

  public vtkOpenGLGL2PSHelperImpl() { super(); }

  public vtkOpenGLGL2PSHelperImpl(long id) { super(id); }
  public native long   VTKInit();

}
