// java wrapper for vtkPlotSurface object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotSurface extends vtkPlot3D
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native void SetInputData_5(vtkTable id0);
  public void SetInputData(vtkTable id0)
  {
    SetInputData_5(id0);
  }

  private native void SetInputData_6(vtkTable id0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3);
  public void SetInputData(vtkTable id0,String id1,String id2,String id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    SetInputData_6(id0,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length);
  }

  private native void SetInputData_7(vtkTable id0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3,byte[] id4, int len4);
  public void SetInputData(vtkTable id0,String id1,String id2,String id3,String id4)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    SetInputData_7(id0,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length,bytes4, bytes4.length);
  }

  private native void SetInputData_8(vtkTable id0,long id1,long id2,long id3);
  public void SetInputData(vtkTable id0,long id1,long id2,long id3)
  {
    SetInputData_8(id0,id1,id2,id3);
  }

  private native void SetXRange_9(float id0,float id1);
  public void SetXRange(float id0,float id1)
  {
    SetXRange_9(id0,id1);
  }

  private native void SetYRange_10(float id0,float id1);
  public void SetYRange(float id0,float id1)
  {
    SetYRange_10(id0,id1);
  }

  public vtkPlotSurface() { super(); }

  public vtkPlotSurface(long id) { super(id); }
  public native long   VTKInit();

}
