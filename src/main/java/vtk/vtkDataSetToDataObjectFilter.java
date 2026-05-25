// java wrapper for vtkDataSetToDataObjectFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataSetToDataObjectFilter extends vtkDataObjectAlgorithm
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

  private native void SetGeometry_4(int id0);
  public void SetGeometry(int id0)
  {
    SetGeometry_4(id0);
  }

  private native int GetGeometry_5();
  public int GetGeometry()
  {
    return GetGeometry_5();
  }

  private native void GeometryOn_6();
  public void GeometryOn()
  {
    GeometryOn_6();
  }

  private native void GeometryOff_7();
  public void GeometryOff()
  {
    GeometryOff_7();
  }

  private native void SetTopology_8(int id0);
  public void SetTopology(int id0)
  {
    SetTopology_8(id0);
  }

  private native int GetTopology_9();
  public int GetTopology()
  {
    return GetTopology_9();
  }

  private native void TopologyOn_10();
  public void TopologyOn()
  {
    TopologyOn_10();
  }

  private native void TopologyOff_11();
  public void TopologyOff()
  {
    TopologyOff_11();
  }

  private native void SetLegacyTopology_12(int id0);
  public void SetLegacyTopology(int id0)
  {
    SetLegacyTopology_12(id0);
  }

  private native int GetLegacyTopology_13();
  public int GetLegacyTopology()
  {
    return GetLegacyTopology_13();
  }

  private native void LegacyTopologyOn_14();
  public void LegacyTopologyOn()
  {
    LegacyTopologyOn_14();
  }

  private native void LegacyTopologyOff_15();
  public void LegacyTopologyOff()
  {
    LegacyTopologyOff_15();
  }

  private native void SetModernTopology_16(int id0);
  public void SetModernTopology(int id0)
  {
    SetModernTopology_16(id0);
  }

  private native int GetModernTopology_17();
  public int GetModernTopology()
  {
    return GetModernTopology_17();
  }

  private native void ModernTopologyOn_18();
  public void ModernTopologyOn()
  {
    ModernTopologyOn_18();
  }

  private native void ModernTopologyOff_19();
  public void ModernTopologyOff()
  {
    ModernTopologyOff_19();
  }

  private native void SetFieldData_20(int id0);
  public void SetFieldData(int id0)
  {
    SetFieldData_20(id0);
  }

  private native int GetFieldData_21();
  public int GetFieldData()
  {
    return GetFieldData_21();
  }

  private native void FieldDataOn_22();
  public void FieldDataOn()
  {
    FieldDataOn_22();
  }

  private native void FieldDataOff_23();
  public void FieldDataOff()
  {
    FieldDataOff_23();
  }

  private native void SetPointData_24(int id0);
  public void SetPointData(int id0)
  {
    SetPointData_24(id0);
  }

  private native int GetPointData_25();
  public int GetPointData()
  {
    return GetPointData_25();
  }

  private native void PointDataOn_26();
  public void PointDataOn()
  {
    PointDataOn_26();
  }

  private native void PointDataOff_27();
  public void PointDataOff()
  {
    PointDataOff_27();
  }

  private native void SetCellData_28(int id0);
  public void SetCellData(int id0)
  {
    SetCellData_28(id0);
  }

  private native int GetCellData_29();
  public int GetCellData()
  {
    return GetCellData_29();
  }

  private native void CellDataOn_30();
  public void CellDataOn()
  {
    CellDataOn_30();
  }

  private native void CellDataOff_31();
  public void CellDataOff()
  {
    CellDataOff_31();
  }

  public vtkDataSetToDataObjectFilter() { super(); }

  public vtkDataSetToDataObjectFilter(long id) { super(id); }
  public native long   VTKInit();

}
