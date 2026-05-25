// java wrapper for vtkRendererNode object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRendererNode extends vtkViewNode
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

  private native void Build_4(boolean id0);
  public void Build(boolean id0)
  {
    Build_4(id0);
  }

  private native int[] GetSize_5();
  public int[] GetSize()
  {
    return GetSize_5();
  }

  private native void SetSize_6(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_6(id0,id1);
  }

  private native void SetSize_7(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_7(id0);
  }

  private native double[] GetViewport_8();
  public double[] GetViewport()
  {
    return GetViewport_8();
  }

  private native void SetViewport_9(double id0,double id1,double id2,double id3);
  public void SetViewport(double id0,double id1,double id2,double id3)
  {
    SetViewport_9(id0,id1,id2,id3);
  }

  private native void SetViewport_10(double id0[]);
  public void SetViewport(double id0[])
  {
    SetViewport_10(id0);
  }

  private native int[] GetScale_11();
  public int[] GetScale()
  {
    return GetScale_11();
  }

  private native void SetScale_12(int id0,int id1);
  public void SetScale(int id0,int id1)
  {
    SetScale_12(id0,id1);
  }

  private native void SetScale_13(int id0[]);
  public void SetScale(int id0[])
  {
    SetScale_13(id0);
  }

  public vtkRendererNode() { super(); }

  public vtkRendererNode(long id) { super(id); }
  public native long   VTKInit();

}
