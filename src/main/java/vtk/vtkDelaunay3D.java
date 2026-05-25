// java wrapper for vtkDelaunay3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDelaunay3D extends vtkUnstructuredGridAlgorithm
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

  private native void SetAlpha_4(double id0);
  public void SetAlpha(double id0)
  {
    SetAlpha_4(id0);
  }

  private native double GetAlphaMinValue_5();
  public double GetAlphaMinValue()
  {
    return GetAlphaMinValue_5();
  }

  private native double GetAlphaMaxValue_6();
  public double GetAlphaMaxValue()
  {
    return GetAlphaMaxValue_6();
  }

  private native double GetAlpha_7();
  public double GetAlpha()
  {
    return GetAlpha_7();
  }

  private native void SetAlphaTets_8(int id0);
  public void SetAlphaTets(int id0)
  {
    SetAlphaTets_8(id0);
  }

  private native int GetAlphaTets_9();
  public int GetAlphaTets()
  {
    return GetAlphaTets_9();
  }

  private native void AlphaTetsOn_10();
  public void AlphaTetsOn()
  {
    AlphaTetsOn_10();
  }

  private native void AlphaTetsOff_11();
  public void AlphaTetsOff()
  {
    AlphaTetsOff_11();
  }

  private native void SetAlphaTris_12(int id0);
  public void SetAlphaTris(int id0)
  {
    SetAlphaTris_12(id0);
  }

  private native int GetAlphaTris_13();
  public int GetAlphaTris()
  {
    return GetAlphaTris_13();
  }

  private native void AlphaTrisOn_14();
  public void AlphaTrisOn()
  {
    AlphaTrisOn_14();
  }

  private native void AlphaTrisOff_15();
  public void AlphaTrisOff()
  {
    AlphaTrisOff_15();
  }

  private native void SetAlphaLines_16(int id0);
  public void SetAlphaLines(int id0)
  {
    SetAlphaLines_16(id0);
  }

  private native int GetAlphaLines_17();
  public int GetAlphaLines()
  {
    return GetAlphaLines_17();
  }

  private native void AlphaLinesOn_18();
  public void AlphaLinesOn()
  {
    AlphaLinesOn_18();
  }

  private native void AlphaLinesOff_19();
  public void AlphaLinesOff()
  {
    AlphaLinesOff_19();
  }

  private native void SetAlphaVerts_20(int id0);
  public void SetAlphaVerts(int id0)
  {
    SetAlphaVerts_20(id0);
  }

  private native int GetAlphaVerts_21();
  public int GetAlphaVerts()
  {
    return GetAlphaVerts_21();
  }

  private native void AlphaVertsOn_22();
  public void AlphaVertsOn()
  {
    AlphaVertsOn_22();
  }

  private native void AlphaVertsOff_23();
  public void AlphaVertsOff()
  {
    AlphaVertsOff_23();
  }

  private native void SetTolerance_24(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_24(id0);
  }

  private native double GetToleranceMinValue_25();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_25();
  }

  private native double GetToleranceMaxValue_26();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_26();
  }

  private native double GetTolerance_27();
  public double GetTolerance()
  {
    return GetTolerance_27();
  }

  private native void SetOffset_28(double id0);
  public void SetOffset(double id0)
  {
    SetOffset_28(id0);
  }

  private native double GetOffsetMinValue_29();
  public double GetOffsetMinValue()
  {
    return GetOffsetMinValue_29();
  }

  private native double GetOffsetMaxValue_30();
  public double GetOffsetMaxValue()
  {
    return GetOffsetMaxValue_30();
  }

  private native double GetOffset_31();
  public double GetOffset()
  {
    return GetOffset_31();
  }

  private native void SetBoundingTriangulation_32(int id0);
  public void SetBoundingTriangulation(int id0)
  {
    SetBoundingTriangulation_32(id0);
  }

  private native int GetBoundingTriangulation_33();
  public int GetBoundingTriangulation()
  {
    return GetBoundingTriangulation_33();
  }

  private native void BoundingTriangulationOn_34();
  public void BoundingTriangulationOn()
  {
    BoundingTriangulationOn_34();
  }

  private native void BoundingTriangulationOff_35();
  public void BoundingTriangulationOff()
  {
    BoundingTriangulationOff_35();
  }

  private native void SetLocator_36(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_36(id0);
  }

  private native long GetLocator_37();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_37();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_38();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_38();
  }

  private native void InsertPoint_39(vtkUnstructuredGrid id0,vtkPoints id1,long id2,double id3[],vtkIdList id4);
  public void InsertPoint(vtkUnstructuredGrid id0,vtkPoints id1,long id2,double id3[],vtkIdList id4)
  {
    InsertPoint_39(id0,id1,id2,id3,id4);
  }

  private native void EndPointInsertion_40();
  public void EndPointInsertion()
  {
    EndPointInsertion_40();
  }

  private native long GetMTime_41();
  public long GetMTime()
  {
    return GetMTime_41();
  }

  private native void SetOutputPointsPrecision_42(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_42(id0);
  }

  private native int GetOutputPointsPrecision_43();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_43();
  }

  public vtkDelaunay3D() { super(); }

  public vtkDelaunay3D(long id) { super(id); }
  public native long   VTKInit();

}
