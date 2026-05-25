// java wrapper for vtkBinCellDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBinCellDataFilter extends vtkDataSetAlgorithm
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

  private native void SetValue_4(int id0,double id1);
  public void SetValue(int id0,double id1)
  {
    SetValue_4(id0,id1);
  }

  private native double GetValue_5(int id0);
  public double GetValue(int id0)
  {
    return GetValue_5(id0);
  }

  private native void SetNumberOfBins_6(int id0);
  public void SetNumberOfBins(int id0)
  {
    SetNumberOfBins_6(id0);
  }

  private native long GetNumberOfBins_7();
  public long GetNumberOfBins()
  {
    return GetNumberOfBins_7();
  }

  private native void GenerateValues_8(int id0,double id1[]);
  public void GenerateValues(int id0,double id1[])
  {
    GenerateValues_8(id0,id1);
  }

  private native void GenerateValues_9(int id0,double id1,double id2);
  public void GenerateValues(int id0,double id1,double id2)
  {
    GenerateValues_9(id0,id1,id2);
  }

  private native void SetSourceData_10(vtkDataObject id0);
  public void SetSourceData(vtkDataObject id0)
  {
    SetSourceData_10(id0);
  }

  private native long GetSource_11();
  public vtkDataObject GetSource()
  {
    long temp = GetSource_11();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSourceConnection_12(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_12(id0);
  }

  private native void SetSpatialMatch_13(int id0);
  public void SetSpatialMatch(int id0)
  {
    SetSpatialMatch_13(id0);
  }

  private native int GetSpatialMatch_14();
  public int GetSpatialMatch()
  {
    return GetSpatialMatch_14();
  }

  private native void SpatialMatchOn_15();
  public void SpatialMatchOn()
  {
    SpatialMatchOn_15();
  }

  private native void SpatialMatchOff_16();
  public void SpatialMatchOff()
  {
    SpatialMatchOff_16();
  }

  private native void SetStoreNumberOfNonzeroBins_17(boolean id0);
  public void SetStoreNumberOfNonzeroBins(boolean id0)
  {
    SetStoreNumberOfNonzeroBins_17(id0);
  }

  private native void StoreNumberOfNonzeroBinsOn_18();
  public void StoreNumberOfNonzeroBinsOn()
  {
    StoreNumberOfNonzeroBinsOn_18();
  }

  private native void StoreNumberOfNonzeroBinsOff_19();
  public void StoreNumberOfNonzeroBinsOff()
  {
    StoreNumberOfNonzeroBinsOff_19();
  }

  private native boolean GetStoreNumberOfNonzeroBins_20();
  public boolean GetStoreNumberOfNonzeroBins()
  {
    return GetStoreNumberOfNonzeroBins_20();
  }

  private native void SetNumberOfNonzeroBinsArrayName_21(byte[] id0, int len0);
  public void SetNumberOfNonzeroBinsArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNumberOfNonzeroBinsArrayName_21(bytes0, bytes0.length);
  }

  private native byte[] GetNumberOfNonzeroBinsArrayName_22();
  public String GetNumberOfNonzeroBinsArrayName()
  {
    return new String(GetNumberOfNonzeroBinsArrayName_22(), StandardCharsets.UTF_8);
  }

  private native void SetTolerance_23(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_23(id0);
  }

  private native double GetTolerance_24();
  public double GetTolerance()
  {
    return GetTolerance_24();
  }

  private native void SetComputeTolerance_25(boolean id0);
  public void SetComputeTolerance(boolean id0)
  {
    SetComputeTolerance_25(id0);
  }

  private native void ComputeToleranceOn_26();
  public void ComputeToleranceOn()
  {
    ComputeToleranceOn_26();
  }

  private native void ComputeToleranceOff_27();
  public void ComputeToleranceOff()
  {
    ComputeToleranceOff_27();
  }

  private native boolean GetComputeTolerance_28();
  public boolean GetComputeTolerance()
  {
    return GetComputeTolerance_28();
  }

  private native void SetArrayComponent_29(int id0);
  public void SetArrayComponent(int id0)
  {
    SetArrayComponent_29(id0);
  }

  private native int GetArrayComponent_30();
  public int GetArrayComponent()
  {
    return GetArrayComponent_30();
  }

  private native void SetCellOverlapMethod_31(int id0);
  public void SetCellOverlapMethod(int id0)
  {
    SetCellOverlapMethod_31(id0);
  }

  private native int GetCellOverlapMethodMinValue_32();
  public int GetCellOverlapMethodMinValue()
  {
    return GetCellOverlapMethodMinValue_32();
  }

  private native int GetCellOverlapMethodMaxValue_33();
  public int GetCellOverlapMethodMaxValue()
  {
    return GetCellOverlapMethodMaxValue_33();
  }

  private native int GetCellOverlapMethod_34();
  public int GetCellOverlapMethod()
  {
    return GetCellOverlapMethod_34();
  }

  private native void SetCellLocator_35(vtkAbstractCellLocator id0);
  public void SetCellLocator(vtkAbstractCellLocator id0)
  {
    SetCellLocator_35(id0);
  }

  private native long GetCellLocator_36();
  public vtkAbstractCellLocator GetCellLocator()
  {
    long temp = GetCellLocator_36();

    if (temp == 0) return null;
    return (vtkAbstractCellLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkBinCellDataFilter() { super(); }

  public vtkBinCellDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
