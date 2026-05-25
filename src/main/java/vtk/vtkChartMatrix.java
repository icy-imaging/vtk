// java wrapper for vtkChartMatrix object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkChartMatrix extends vtkAbstractContextItem
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

  private native void Update_4();
  public void Update()
  {
    Update_4();
  }

  private native boolean Paint_5(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_5(id0);
  }

  private native void SetBorders_6(int id0,int id1,int id2,int id3);
  public void SetBorders(int id0,int id1,int id2,int id3)
  {
    SetBorders_6(id0,id1,id2,id3);
  }

  private native void SetBorderLeft_7(int id0);
  public void SetBorderLeft(int id0)
  {
    SetBorderLeft_7(id0);
  }

  private native void SetBorderBottom_8(int id0);
  public void SetBorderBottom(int id0)
  {
    SetBorderBottom_8(id0);
  }

  private native void SetBorderRight_9(int id0);
  public void SetBorderRight(int id0)
  {
    SetBorderRight_9(id0);
  }

  private native void SetBorderTop_10(int id0);
  public void SetBorderTop(int id0)
  {
    SetBorderTop_10(id0);
  }

  private native void GetBorders_11(int id0[]);
  public void GetBorders(int id0[])
  {
    GetBorders_11(id0);
  }

  private native void SetGutterX_12(float id0);
  public void SetGutterX(float id0)
  {
    SetGutterX_12(id0);
  }

  private native void SetGutterY_13(float id0);
  public void SetGutterY(float id0)
  {
    SetGutterY_13(id0);
  }

  private native void ClearSpecificResizes_14();
  public void ClearSpecificResizes()
  {
    ClearSpecificResizes_14();
  }

  private native void Allocate_15();
  public void Allocate()
  {
    Allocate_15();
  }

  private native void ResetLinks_16(int id0);
  public void ResetLinks(int id0)
  {
    ResetLinks_16(id0);
  }

  private native void ResetLinkedLayout_17();
  public void ResetLinkedLayout()
  {
    ResetLinkedLayout_17();
  }

  private native boolean IsDoneWithTraversal_18();
  public boolean IsDoneWithTraversal()
  {
    return IsDoneWithTraversal_18();
  }

  private native void SetFillStrategy_19(int id0);
  public void SetFillStrategy(int id0)
  {
    SetFillStrategy_19(id0);
  }

  private native int GetFillStrategy_20();
  public int GetFillStrategy()
  {
    return GetFillStrategy_20();
  }

  public vtkChartMatrix() { super(); }

  public vtkChartMatrix(long id) { super(id); }
  public native long   VTKInit();

}
