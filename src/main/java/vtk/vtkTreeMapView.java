// java wrapper for vtkTreeMapView object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTreeMapView extends vtkTreeAreaView
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

  private native void SetLayoutStrategy_4(vtkAreaLayoutStrategy id0);
  public void SetLayoutStrategy(vtkAreaLayoutStrategy id0)
  {
    SetLayoutStrategy_4(id0);
  }

  private native void SetLayoutStrategy_5(byte[] id0, int len0);
  public void SetLayoutStrategy(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLayoutStrategy_5(bytes0, bytes0.length);
  }

  private native void SetLayoutStrategyToBox_6();
  public void SetLayoutStrategyToBox()
  {
    SetLayoutStrategyToBox_6();
  }

  private native void SetLayoutStrategyToSliceAndDice_7();
  public void SetLayoutStrategyToSliceAndDice()
  {
    SetLayoutStrategyToSliceAndDice_7();
  }

  private native void SetLayoutStrategyToSquarify_8();
  public void SetLayoutStrategyToSquarify()
  {
    SetLayoutStrategyToSquarify_8();
  }

  private native void SetFontSizeRange_9(int id0,int id1,int id2);
  public void SetFontSizeRange(int id0,int id1,int id2)
  {
    SetFontSizeRange_9(id0,id1,id2);
  }

  private native void GetFontSizeRange_10(int id0[]);
  public void GetFontSizeRange(int id0[])
  {
    GetFontSizeRange_10(id0);
  }

  public vtkTreeMapView() { super(); }

  public vtkTreeMapView(long id) { super(id); }
  public native long   VTKInit();

}
