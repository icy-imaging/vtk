// java wrapper for vtkOpenGLGL2PSHelper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLGL2PSHelper extends vtkObject
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

  private native long GetInstance_4();
  public vtkOpenGLGL2PSHelper GetInstance()
  {
    long temp = GetInstance_4();

    if (temp == 0) return null;
    return (vtkOpenGLGL2PSHelper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInstance_5(vtkOpenGLGL2PSHelper id0);
  public void SetInstance(vtkOpenGLGL2PSHelper id0)
  {
    SetInstance_5(id0);
  }

  private native long GetRenderWindow_6();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_6();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetActiveState_7();
  public int GetActiveState()
  {
    return GetActiveState_7();
  }

  private native void SetPointSize_8(float id0);
  public void SetPointSize(float id0)
  {
    SetPointSize_8(id0);
  }

  private native float GetPointSize_9();
  public float GetPointSize()
  {
    return GetPointSize_9();
  }

  private native void SetLineWidth_10(float id0);
  public void SetLineWidth(float id0)
  {
    SetLineWidth_10(id0);
  }

  private native float GetLineWidth_11();
  public float GetLineWidth()
  {
    return GetLineWidth_11();
  }

  private native void SetLineStipple_12(short id0);
  public void SetLineStipple(short id0)
  {
    SetLineStipple_12(id0);
  }

  private native short GetLineStipple_13();
  public short GetLineStipple()
  {
    return GetLineStipple_13();
  }

  private native void ProcessTransformFeedback_14(vtkTransformFeedback id0,vtkRenderer id1,vtkActor id2);
  public void ProcessTransformFeedback(vtkTransformFeedback id0,vtkRenderer id1,vtkActor id2)
  {
    ProcessTransformFeedback_14(id0,id1,id2);
  }

  private native void ProcessTransformFeedback_15(vtkTransformFeedback id0,vtkRenderer id1,float id2[]);
  public void ProcessTransformFeedback(vtkTransformFeedback id0,vtkRenderer id1,float id2[])
  {
    ProcessTransformFeedback_15(id0,id1,id2);
  }

  private native void DrawString_16(byte[] id0, int len0,vtkTextProperty id1,double id2[],double id3,vtkRenderer id4);
  public void DrawString(String id0,vtkTextProperty id1,double id2[],double id3,vtkRenderer id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DrawString_16(bytes0, bytes0.length,id1,id2,id3,id4);
  }

  private native void DrawImage_17(vtkImageData id0,double id1[]);
  public void DrawImage(vtkImageData id0,double id1[])
  {
    DrawImage_17(id0,id1);
  }

  public vtkOpenGLGL2PSHelper() { super(); }

  public vtkOpenGLGL2PSHelper(long id) { super(id); }
  public native long   VTKInit();

}
