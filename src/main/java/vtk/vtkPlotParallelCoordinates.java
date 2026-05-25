// java wrapper for vtkPlotParallelCoordinates object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotParallelCoordinates extends vtkPlot
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

  private native void GetBounds_5(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_5(id0);
  }

  private native boolean SetSelectionRange_6(int id0,float id1,float id2);
  public boolean SetSelectionRange(int id0,float id1,float id2)
  {
    return SetSelectionRange_6(id0,id1,id2);
  }

  private native boolean ResetSelectionRange_7();
  public boolean ResetSelectionRange()
  {
    return ResetSelectionRange_7();
  }

  private native void SetInputData_8(vtkTable id0);
  public void SetInputData(vtkTable id0)
  {
    SetInputData_8(id0);
  }

  private native void SetInputData_9(vtkTable id0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetInputData(vtkTable id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetInputData_9(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native void SetLookupTable_10(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_10(id0);
  }

  private native long GetLookupTable_11();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_11();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLookupTable_12();
  public void CreateDefaultLookupTable()
  {
    CreateDefaultLookupTable_12();
  }

  private native void SetScalarVisibility_13(int id0);
  public void SetScalarVisibility(int id0)
  {
    SetScalarVisibility_13(id0);
  }

  private native int GetScalarVisibility_14();
  public int GetScalarVisibility()
  {
    return GetScalarVisibility_14();
  }

  private native void ScalarVisibilityOn_15();
  public void ScalarVisibilityOn()
  {
    ScalarVisibilityOn_15();
  }

  private native void ScalarVisibilityOff_16();
  public void ScalarVisibilityOff()
  {
    ScalarVisibilityOff_16();
  }

  private native void SelectColorArray_17(long id0);
  public void SelectColorArray(long id0)
  {
    SelectColorArray_17(id0);
  }

  private native void SelectColorArray_18(byte[] id0, int len0);
  public void SelectColorArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectColorArray_18(bytes0, bytes0.length);
  }

  private native void SetColorMode_19(int id0);
  public void SetColorMode(int id0)
  {
    SetColorMode_19(id0);
  }

  private native void SetColorModeToDefault_20();
  public void SetColorModeToDefault()
  {
    SetColorModeToDefault_20();
  }

  private native void SetColorModeToMapScalars_21();
  public void SetColorModeToMapScalars()
  {
    SetColorModeToMapScalars_21();
  }

  private native void SetColorModeToDirectScalars_22();
  public void SetColorModeToDirectScalars()
  {
    SetColorModeToDirectScalars_22();
  }

  private native int GetColorMode_23();
  public int GetColorMode()
  {
    return GetColorMode_23();
  }

  private native byte[] GetColorArrayName_24();
  public String GetColorArrayName()
  {
    return new String(GetColorArrayName_24(), StandardCharsets.UTF_8);
  }

  private native boolean UpdateCache_25();
  public boolean UpdateCache()
  {
    return UpdateCache_25();
  }

  public vtkPlotParallelCoordinates() { super(); }

  public vtkPlotParallelCoordinates(long id) { super(id); }
  public native long   VTKInit();

}
