// java wrapper for vtkSegYReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSegYReader extends vtkDataSetAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetXYCoordMode_6(int id0);
  public void SetXYCoordMode(int id0)
  {
    SetXYCoordMode_6(id0);
  }

  private native int GetXYCoordModeMinValue_7();
  public int GetXYCoordModeMinValue()
  {
    return GetXYCoordModeMinValue_7();
  }

  private native int GetXYCoordModeMaxValue_8();
  public int GetXYCoordModeMaxValue()
  {
    return GetXYCoordModeMaxValue_8();
  }

  private native int GetXYCoordMode_9();
  public int GetXYCoordMode()
  {
    return GetXYCoordMode_9();
  }

  private native void SetXYCoordModeToSource_10();
  public void SetXYCoordModeToSource()
  {
    SetXYCoordModeToSource_10();
  }

  private native void SetXYCoordModeToCDP_11();
  public void SetXYCoordModeToCDP()
  {
    SetXYCoordModeToCDP_11();
  }

  private native void SetXYCoordModeToCustom_12();
  public void SetXYCoordModeToCustom()
  {
    SetXYCoordModeToCustom_12();
  }

  private native void SetXCoordByte_13(int id0);
  public void SetXCoordByte(int id0)
  {
    SetXCoordByte_13(id0);
  }

  private native int GetXCoordByte_14();
  public int GetXCoordByte()
  {
    return GetXCoordByte_14();
  }

  private native void SetYCoordByte_15(int id0);
  public void SetYCoordByte(int id0)
  {
    SetYCoordByte_15(id0);
  }

  private native int GetYCoordByte_16();
  public int GetYCoordByte()
  {
    return GetYCoordByte_16();
  }

  private native void SetVerticalCRS_17(int id0);
  public void SetVerticalCRS(int id0)
  {
    SetVerticalCRS_17(id0);
  }

  private native int GetVerticalCRS_18();
  public int GetVerticalCRS()
  {
    return GetVerticalCRS_18();
  }

  private native void SetStructuredGrid_19(int id0);
  public void SetStructuredGrid(int id0)
  {
    SetStructuredGrid_19(id0);
  }

  private native int GetStructuredGrid_20();
  public int GetStructuredGrid()
  {
    return GetStructuredGrid_20();
  }

  private native void StructuredGridOn_21();
  public void StructuredGridOn()
  {
    StructuredGridOn_21();
  }

  private native void StructuredGridOff_22();
  public void StructuredGridOff()
  {
    StructuredGridOff_22();
  }

  private native void SetForce2D_23(boolean id0);
  public void SetForce2D(boolean id0)
  {
    SetForce2D_23(id0);
  }

  private native boolean GetForce2D_24();
  public boolean GetForce2D()
  {
    return GetForce2D_24();
  }

  private native void Force2DOn_25();
  public void Force2DOn()
  {
    Force2DOn_25();
  }

  private native void Force2DOff_26();
  public void Force2DOff()
  {
    Force2DOff_26();
  }

  public vtkSegYReader() { super(); }

  public vtkSegYReader(long id) { super(id); }
  public native long   VTKInit();

}
