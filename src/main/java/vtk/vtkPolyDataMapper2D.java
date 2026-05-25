// java wrapper for vtkPolyDataMapper2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataMapper2D extends vtkMapper2D
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

  private native void SetInputData_4(vtkPolyData id0);
  public void SetInputData(vtkPolyData id0)
  {
    SetInputData_4(id0);
  }

  private native long GetInput_5();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLookupTable_6(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_6(id0);
  }

  private native long GetLookupTable_7();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_7();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLookupTable_8();
  public void CreateDefaultLookupTable()
  {
    CreateDefaultLookupTable_8();
  }

  private native void SetScalarVisibility_9(int id0);
  public void SetScalarVisibility(int id0)
  {
    SetScalarVisibility_9(id0);
  }

  private native int GetScalarVisibility_10();
  public int GetScalarVisibility()
  {
    return GetScalarVisibility_10();
  }

  private native void ScalarVisibilityOn_11();
  public void ScalarVisibilityOn()
  {
    ScalarVisibilityOn_11();
  }

  private native void ScalarVisibilityOff_12();
  public void ScalarVisibilityOff()
  {
    ScalarVisibilityOff_12();
  }

  private native void SetColorMode_13(int id0);
  public void SetColorMode(int id0)
  {
    SetColorMode_13(id0);
  }

  private native int GetColorMode_14();
  public int GetColorMode()
  {
    return GetColorMode_14();
  }

  private native void SetColorModeToDefault_15();
  public void SetColorModeToDefault()
  {
    SetColorModeToDefault_15();
  }

  private native void SetColorModeToMapScalars_16();
  public void SetColorModeToMapScalars()
  {
    SetColorModeToMapScalars_16();
  }

  private native void SetColorModeToDirectScalars_17();
  public void SetColorModeToDirectScalars()
  {
    SetColorModeToDirectScalars_17();
  }

  private native byte[] GetColorModeAsString_18();
  public String GetColorModeAsString()
  {
    return new String(GetColorModeAsString_18(), StandardCharsets.UTF_8);
  }

  private native void SetUseLookupTableScalarRange_19(int id0);
  public void SetUseLookupTableScalarRange(int id0)
  {
    SetUseLookupTableScalarRange_19(id0);
  }

  private native int GetUseLookupTableScalarRange_20();
  public int GetUseLookupTableScalarRange()
  {
    return GetUseLookupTableScalarRange_20();
  }

  private native void UseLookupTableScalarRangeOn_21();
  public void UseLookupTableScalarRangeOn()
  {
    UseLookupTableScalarRangeOn_21();
  }

  private native void UseLookupTableScalarRangeOff_22();
  public void UseLookupTableScalarRangeOff()
  {
    UseLookupTableScalarRangeOff_22();
  }

  private native void SetScalarRange_23(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_23(id0,id1);
  }

  private native void SetScalarRange_24(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_24(id0);
  }

  private native double[] GetScalarRange_25();
  public double[] GetScalarRange()
  {
    return GetScalarRange_25();
  }

  private native void SetScalarMode_26(int id0);
  public void SetScalarMode(int id0)
  {
    SetScalarMode_26(id0);
  }

  private native int GetScalarMode_27();
  public int GetScalarMode()
  {
    return GetScalarMode_27();
  }

  private native void SetScalarModeToDefault_28();
  public void SetScalarModeToDefault()
  {
    SetScalarModeToDefault_28();
  }

  private native void SetScalarModeToUsePointData_29();
  public void SetScalarModeToUsePointData()
  {
    SetScalarModeToUsePointData_29();
  }

  private native void SetScalarModeToUseCellData_30();
  public void SetScalarModeToUseCellData()
  {
    SetScalarModeToUseCellData_30();
  }

  private native void SetScalarModeToUsePointFieldData_31();
  public void SetScalarModeToUsePointFieldData()
  {
    SetScalarModeToUsePointFieldData_31();
  }

  private native void SetScalarModeToUseCellFieldData_32();
  public void SetScalarModeToUseCellFieldData()
  {
    SetScalarModeToUseCellFieldData_32();
  }

  private native void ColorByArrayComponent_33(int id0,int id1);
  public void ColorByArrayComponent(int id0,int id1)
  {
    ColorByArrayComponent_33(id0,id1);
  }

  private native void ColorByArrayComponent_34(byte[] id0, int len0,int id1);
  public void ColorByArrayComponent(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ColorByArrayComponent_34(bytes0, bytes0.length,id1);
  }

  private native byte[] GetArrayName_35();
  public String GetArrayName()
  {
    return new String(GetArrayName_35(), StandardCharsets.UTF_8);
  }

  private native int GetArrayId_36();
  public int GetArrayId()
  {
    return GetArrayId_36();
  }

  private native int GetArrayAccessMode_37();
  public int GetArrayAccessMode()
  {
    return GetArrayAccessMode_37();
  }

  private native int GetArrayComponent_38();
  public int GetArrayComponent()
  {
    return GetArrayComponent_38();
  }

  private native long GetMTime_39();
  public long GetMTime()
  {
    return GetMTime_39();
  }

  private native void SetTransformCoordinate_40(vtkCoordinate id0);
  public void SetTransformCoordinate(vtkCoordinate id0)
  {
    SetTransformCoordinate_40(id0);
  }

  private native long GetTransformCoordinate_41();
  public vtkCoordinate GetTransformCoordinate()
  {
    long temp = GetTransformCoordinate_41();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetTransformCoordinateUseDouble_42();
  public boolean GetTransformCoordinateUseDouble()
  {
    return GetTransformCoordinateUseDouble_42();
  }

  private native void SetTransformCoordinateUseDouble_43(boolean id0);
  public void SetTransformCoordinateUseDouble(boolean id0)
  {
    SetTransformCoordinateUseDouble_43(id0);
  }

  private native void TransformCoordinateUseDoubleOn_44();
  public void TransformCoordinateUseDoubleOn()
  {
    TransformCoordinateUseDoubleOn_44();
  }

  private native void TransformCoordinateUseDoubleOff_45();
  public void TransformCoordinateUseDoubleOff()
  {
    TransformCoordinateUseDoubleOff_45();
  }

  private native long MapScalars_46(double id0);
  public vtkUnsignedCharArray MapScalars(double id0)
  {
    long temp = MapScalars_46(id0);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ShallowCopy_47(vtkAbstractMapper id0);
  public void ShallowCopy(vtkAbstractMapper id0)
  {
    ShallowCopy_47(id0);
  }

  public vtkPolyDataMapper2D() { super(); }

  public vtkPolyDataMapper2D(long id) { super(id); }
  public native long   VTKInit();

}
