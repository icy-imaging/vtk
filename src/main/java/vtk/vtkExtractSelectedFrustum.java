// java wrapper for vtkExtractSelectedFrustum object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractSelectedFrustum extends vtkExtractSelectionBase
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetFrustum_5(vtkPlanes id0);
  public void SetFrustum(vtkPlanes id0)
  {
    SetFrustum_5(id0);
  }

  private native long GetFrustum_6();
  public vtkPlanes GetFrustum()
  {
    long temp = GetFrustum_6();

    if (temp == 0) return null;
    return (vtkPlanes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateFrustum_7(double id0[]);
  public void CreateFrustum(double id0[])
  {
    CreateFrustum_7(id0);
  }

  private native long GetClipPoints_8();
  public vtkPoints GetClipPoints()
  {
    long temp = GetClipPoints_8();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFieldType_9(int id0);
  public void SetFieldType(int id0)
  {
    SetFieldType_9(id0);
  }

  private native int GetFieldType_10();
  public int GetFieldType()
  {
    return GetFieldType_10();
  }

  private native void SetContainingCells_11(int id0);
  public void SetContainingCells(int id0)
  {
    SetContainingCells_11(id0);
  }

  private native int GetContainingCells_12();
  public int GetContainingCells()
  {
    return GetContainingCells_12();
  }

  private native void SetShowBounds_13(int id0);
  public void SetShowBounds(int id0)
  {
    SetShowBounds_13(id0);
  }

  private native int GetShowBounds_14();
  public int GetShowBounds()
  {
    return GetShowBounds_14();
  }

  private native void ShowBoundsOn_15();
  public void ShowBoundsOn()
  {
    ShowBoundsOn_15();
  }

  private native void ShowBoundsOff_16();
  public void ShowBoundsOff()
  {
    ShowBoundsOff_16();
  }

  private native void SetInsideOut_17(int id0);
  public void SetInsideOut(int id0)
  {
    SetInsideOut_17(id0);
  }

  private native int GetInsideOut_18();
  public int GetInsideOut()
  {
    return GetInsideOut_18();
  }

  private native void InsideOutOn_19();
  public void InsideOutOn()
  {
    InsideOutOn_19();
  }

  private native void InsideOutOff_20();
  public void InsideOutOff()
  {
    InsideOutOff_20();
  }

  public vtkExtractSelectedFrustum() { super(); }

  public vtkExtractSelectedFrustum(long id) { super(id); }
  public native long   VTKInit();

}
