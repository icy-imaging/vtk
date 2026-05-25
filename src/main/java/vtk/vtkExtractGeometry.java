// java wrapper for vtkExtractGeometry object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractGeometry extends vtkUnstructuredGridAlgorithm
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

  private native void SetImplicitFunction_5(vtkImplicitFunction id0);
  public void SetImplicitFunction(vtkImplicitFunction id0)
  {
    SetImplicitFunction_5(id0);
  }

  private native long GetImplicitFunction_6();
  public vtkImplicitFunction GetImplicitFunction()
  {
    long temp = GetImplicitFunction_6();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetExtractInside_7(int id0);
  public void SetExtractInside(int id0)
  {
    SetExtractInside_7(id0);
  }

  private native int GetExtractInside_8();
  public int GetExtractInside()
  {
    return GetExtractInside_8();
  }

  private native void ExtractInsideOn_9();
  public void ExtractInsideOn()
  {
    ExtractInsideOn_9();
  }

  private native void ExtractInsideOff_10();
  public void ExtractInsideOff()
  {
    ExtractInsideOff_10();
  }

  private native void SetExtractBoundaryCells_11(int id0);
  public void SetExtractBoundaryCells(int id0)
  {
    SetExtractBoundaryCells_11(id0);
  }

  private native int GetExtractBoundaryCells_12();
  public int GetExtractBoundaryCells()
  {
    return GetExtractBoundaryCells_12();
  }

  private native void ExtractBoundaryCellsOn_13();
  public void ExtractBoundaryCellsOn()
  {
    ExtractBoundaryCellsOn_13();
  }

  private native void ExtractBoundaryCellsOff_14();
  public void ExtractBoundaryCellsOff()
  {
    ExtractBoundaryCellsOff_14();
  }

  private native void SetExtractOnlyBoundaryCells_15(int id0);
  public void SetExtractOnlyBoundaryCells(int id0)
  {
    SetExtractOnlyBoundaryCells_15(id0);
  }

  private native int GetExtractOnlyBoundaryCells_16();
  public int GetExtractOnlyBoundaryCells()
  {
    return GetExtractOnlyBoundaryCells_16();
  }

  private native void ExtractOnlyBoundaryCellsOn_17();
  public void ExtractOnlyBoundaryCellsOn()
  {
    ExtractOnlyBoundaryCellsOn_17();
  }

  private native void ExtractOnlyBoundaryCellsOff_18();
  public void ExtractOnlyBoundaryCellsOff()
  {
    ExtractOnlyBoundaryCellsOff_18();
  }

  public vtkExtractGeometry() { super(); }

  public vtkExtractGeometry(long id) { super(id); }
  public native long   VTKInit();

}
