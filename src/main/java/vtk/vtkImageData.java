// java wrapper for vtkImageData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageData extends vtkDataSet
{

  private native long ExtendedNew_0();
  public vtkImageData ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsTypeOf_1(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_1(bytes0, bytes0.length);
  }

  private native int IsA_2(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_3(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_4(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_4(bytes0, bytes0.length);
  }

  private native void CopyStructure_5(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_5(id0);
  }

  private native void Initialize_6();
  public void Initialize()
  {
    Initialize_6();
  }

  private native int GetDataObjectType_7();
  public int GetDataObjectType()
  {
    return GetDataObjectType_7();
  }

  private native long GetNumberOfCells_8();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_8();
  }

  private native long GetNumberOfPoints_9();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_9();
  }

  private native long GetPoints_10();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_10();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double[] GetPoint_11(long id0);
  public double[] GetPoint(long id0)
  {
    return GetPoint_11(id0);
  }

  private native void GetPoint_12(long id0,double id1[]);
  public void GetPoint(long id0,double id1[])
  {
    GetPoint_12(id0,id1);
  }

  private native long GetCell_13(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_13(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCell_14(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_14(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_15(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_15(id0,id1);
  }

  private native void GetCellBounds_16(long id0,double id1[]);
  public void GetCellBounds(long id0,double id1[])
  {
    GetCellBounds_16(id0,id1);
  }

  private native long FindPoint_17(double id0[]);
  public long FindPoint(double id0[])
  {
    return FindPoint_17(id0);
  }

  private native int GetCellType_18(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_18(id0);
  }

  private native long GetCellSize_19(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_19(id0);
  }

  private native void GetCellPoints_20(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_20(id0,id1);
  }

  private native void GetPointCells_21(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_21(id0,id1);
  }

  private native void ComputeBounds_22();
  public void ComputeBounds()
  {
    ComputeBounds_22();
  }

  private native int GetMaxCellSize_23();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_23();
  }

  private native int GetMaxSpatialDimension_24();
  public int GetMaxSpatialDimension()
  {
    return GetMaxSpatialDimension_24();
  }

  private native void GetCellNeighbors_25(long id0,vtkIdList id1,vtkIdList id2);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2)
  {
    GetCellNeighbors_25(id0,id1,id2);
  }

  private native long GetCells_26();
  public vtkStructuredCellArray GetCells()
  {
    long temp = GetCells_26();

    if (temp == 0) return null;
    return (vtkStructuredCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BlankPoint_27(long id0);
  public void BlankPoint(long id0)
  {
    BlankPoint_27(id0);
  }

  private native void UnBlankPoint_28(long id0);
  public void UnBlankPoint(long id0)
  {
    UnBlankPoint_28(id0);
  }

  private native void BlankPoint_29(int id0,int id1,int id2);
  public void BlankPoint(int id0,int id1,int id2)
  {
    BlankPoint_29(id0,id1,id2);
  }

  private native void UnBlankPoint_30(int id0,int id1,int id2);
  public void UnBlankPoint(int id0,int id1,int id2)
  {
    UnBlankPoint_30(id0,id1,id2);
  }

  private native void BlankCell_31(long id0);
  public void BlankCell(long id0)
  {
    BlankCell_31(id0);
  }

  private native void UnBlankCell_32(long id0);
  public void UnBlankCell(long id0)
  {
    UnBlankCell_32(id0);
  }

  private native void BlankCell_33(int id0,int id1,int id2);
  public void BlankCell(int id0,int id1,int id2)
  {
    BlankCell_33(id0,id1,id2);
  }

  private native void UnBlankCell_34(int id0,int id1,int id2);
  public void UnBlankCell(int id0,int id1,int id2)
  {
    UnBlankCell_34(id0,id1,id2);
  }

  private native byte IsPointVisible_35(long id0);
  public byte IsPointVisible(long id0)
  {
    return IsPointVisible_35(id0);
  }

  private native byte IsCellVisible_36(long id0);
  public byte IsCellVisible(long id0)
  {
    return IsCellVisible_36(id0);
  }

  private native boolean HasAnyBlankPoints_37();
  public boolean HasAnyBlankPoints()
  {
    return HasAnyBlankPoints_37();
  }

  private native boolean HasAnyBlankCells_38();
  public boolean HasAnyBlankCells()
  {
    return HasAnyBlankCells_38();
  }

  private native int GetDataDescription_39();
  public int GetDataDescription()
  {
    return GetDataDescription_39();
  }

  private native void GetCellDims_40(int id0[]);
  public void GetCellDims(int id0[])
  {
    GetCellDims_40(id0);
  }

  private native void SetDimensions_41(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_41(id0,id1,id2);
  }

  private native void SetDimensions_42(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_42(id0);
  }

  private native int[] GetDimensions_43();
  public int[] GetDimensions()
  {
    return GetDimensions_43();
  }

  private native void GetDimensions_44(int id0[]);
  public void GetDimensions(int id0[])
  {
    GetDimensions_44(id0);
  }

  private native void GetDimensions_45(long id0[]);
  public void GetDimensions(long id0[])
  {
    GetDimensions_45(id0);
  }

  private native int ComputeStructuredCoordinates_46(double id0[],int id1[],double id2[]);
  public int ComputeStructuredCoordinates(double id0[],int id1[],double id2[])
  {
    return ComputeStructuredCoordinates_46(id0,id1,id2);
  }

  private native void GetVoxelGradient_47(int id0,int id1,int id2,vtkDataArray id3,vtkDataArray id4);
  public void GetVoxelGradient(int id0,int id1,int id2,vtkDataArray id3,vtkDataArray id4)
  {
    GetVoxelGradient_47(id0,id1,id2,id3,id4);
  }

  private native void GetPointGradient_48(int id0,int id1,int id2,vtkDataArray id3,double id4[]);
  public void GetPointGradient(int id0,int id1,int id2,vtkDataArray id3,double id4[])
  {
    GetPointGradient_48(id0,id1,id2,id3,id4);
  }

  private native int GetDataDimension_49();
  public int GetDataDimension()
  {
    return GetDataDimension_49();
  }

  private native long ComputePointId_50(int id0[]);
  public long ComputePointId(int id0[])
  {
    return ComputePointId_50(id0);
  }

  private native long ComputeCellId_51(int id0[]);
  public long ComputeCellId(int id0[])
  {
    return ComputeCellId_51(id0);
  }

  private native void SetExtent_52(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_52(id0);
  }

  private native void SetExtent_53(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_53(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetExtent_54();
  public int[] GetExtent()
  {
    return GetExtent_54();
  }

  private native double GetScalarTypeMin_55(vtkInformation id0);
  public double GetScalarTypeMin(vtkInformation id0)
  {
    return GetScalarTypeMin_55(id0);
  }

  private native double GetScalarTypeMin_56();
  public double GetScalarTypeMin()
  {
    return GetScalarTypeMin_56();
  }

  private native double GetScalarTypeMax_57(vtkInformation id0);
  public double GetScalarTypeMax(vtkInformation id0)
  {
    return GetScalarTypeMax_57(id0);
  }

  private native double GetScalarTypeMax_58();
  public double GetScalarTypeMax()
  {
    return GetScalarTypeMax_58();
  }

  private native int GetScalarSize_59(vtkInformation id0);
  public int GetScalarSize(vtkInformation id0)
  {
    return GetScalarSize_59(id0);
  }

  private native int GetScalarSize_60();
  public int GetScalarSize()
  {
    return GetScalarSize_60();
  }

  private native long[]  GetIncrements_61();
  public long[]  GetIncrements()
  {
    return GetIncrements_61();
  }

  private native void GetIncrements_62(long id0[]);
  public void GetIncrements(long id0[])
  {
    GetIncrements_62(id0);
  }

  private native long[]  GetIncrements_63(vtkDataArray id0);
  public long[]  GetIncrements(vtkDataArray id0)
  {
    return GetIncrements_63(id0);
  }

  private native void GetIncrements_64(vtkDataArray id0,long id1[]);
  public void GetIncrements(vtkDataArray id0,long id1[])
  {
    GetIncrements_64(id0,id1);
  }

  private native long GetScalarIndexForExtent_65(int id0[]);
  public long GetScalarIndexForExtent(int id0[])
  {
    return GetScalarIndexForExtent_65(id0);
  }

  private native long GetScalarIndex_66(int id0[]);
  public long GetScalarIndex(int id0[])
  {
    return GetScalarIndex_66(id0);
  }

  private native long GetScalarIndex_67(int id0,int id1,int id2);
  public long GetScalarIndex(int id0,int id1,int id2)
  {
    return GetScalarIndex_67(id0,id1,id2);
  }

  private native float GetScalarComponentAsFloat_68(int id0,int id1,int id2,int id3);
  public float GetScalarComponentAsFloat(int id0,int id1,int id2,int id3)
  {
    return GetScalarComponentAsFloat_68(id0,id1,id2,id3);
  }

  private native void SetScalarComponentFromFloat_69(int id0,int id1,int id2,int id3,float id4);
  public void SetScalarComponentFromFloat(int id0,int id1,int id2,int id3,float id4)
  {
    SetScalarComponentFromFloat_69(id0,id1,id2,id3,id4);
  }

  private native double GetScalarComponentAsDouble_70(int id0,int id1,int id2,int id3);
  public double GetScalarComponentAsDouble(int id0,int id1,int id2,int id3)
  {
    return GetScalarComponentAsDouble_70(id0,id1,id2,id3);
  }

  private native void SetScalarComponentFromDouble_71(int id0,int id1,int id2,int id3,double id4);
  public void SetScalarComponentFromDouble(int id0,int id1,int id2,int id3,double id4)
  {
    SetScalarComponentFromDouble_71(id0,id1,id2,id3,id4);
  }

  private native void AllocateScalars_72(int id0,int id1);
  public void AllocateScalars(int id0,int id1)
  {
    AllocateScalars_72(id0,id1);
  }

  private native void AllocateScalars_73(vtkInformation id0);
  public void AllocateScalars(vtkInformation id0)
  {
    AllocateScalars_73(id0);
  }

  private native void CopyAndCastFrom_74(vtkImageData id0,int id1[]);
  public void CopyAndCastFrom(vtkImageData id0,int id1[])
  {
    CopyAndCastFrom_74(id0,id1);
  }

  private native void CopyAndCastFrom_75(vtkImageData id0,int id1,int id2,int id3,int id4,int id5,int id6);
  public void CopyAndCastFrom(vtkImageData id0,int id1,int id2,int id3,int id4,int id5,int id6)
  {
    CopyAndCastFrom_75(id0,id1,id2,id3,id4,id5,id6);
  }

  private native long GetActualMemorySize_76();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_76();
  }

  private native double[] GetSpacing_77();
  public double[] GetSpacing()
  {
    return GetSpacing_77();
  }

  private native void SetSpacing_78(double id0,double id1,double id2);
  public void SetSpacing(double id0,double id1,double id2)
  {
    SetSpacing_78(id0,id1,id2);
  }

  private native void SetSpacing_79(double id0[]);
  public void SetSpacing(double id0[])
  {
    SetSpacing_79(id0);
  }

  private native double[] GetOrigin_80();
  public double[] GetOrigin()
  {
    return GetOrigin_80();
  }

  private native void SetOrigin_81(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_81(id0,id1,id2);
  }

  private native void SetOrigin_82(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_82(id0);
  }

  private native long GetDirectionMatrix_83();
  public vtkMatrix3x3 GetDirectionMatrix()
  {
    long temp = GetDirectionMatrix_83();

    if (temp == 0) return null;
    return (vtkMatrix3x3)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDirectionMatrix_84(vtkMatrix3x3 id0);
  public void SetDirectionMatrix(vtkMatrix3x3 id0)
  {
    SetDirectionMatrix_84(id0);
  }

  private native void SetDirectionMatrix_85(double id0[]);
  public void SetDirectionMatrix(double id0[])
  {
    SetDirectionMatrix_85(id0);
  }

  private native void SetDirectionMatrix_86(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8);
  public void SetDirectionMatrix(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8)
  {
    SetDirectionMatrix_86(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native long GetIndexToPhysicalMatrix_87();
  public vtkMatrix4x4 GetIndexToPhysicalMatrix()
  {
    long temp = GetIndexToPhysicalMatrix_87();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ApplyIndexToPhysicalMatrix_88(vtkMatrix4x4 id0);
  public void ApplyIndexToPhysicalMatrix(vtkMatrix4x4 id0)
  {
    ApplyIndexToPhysicalMatrix_88(id0);
  }

  private native void TransformContinuousIndexToPhysicalPoint_89(double id0,double id1,double id2,double id3[]);
  public void TransformContinuousIndexToPhysicalPoint(double id0,double id1,double id2,double id3[])
  {
    TransformContinuousIndexToPhysicalPoint_89(id0,id1,id2,id3);
  }

  private native void TransformContinuousIndexToPhysicalPoint_90(double id0[],double id1[]);
  public void TransformContinuousIndexToPhysicalPoint(double id0[],double id1[])
  {
    TransformContinuousIndexToPhysicalPoint_90(id0,id1);
  }

  private native void TransformIndexToPhysicalPoint_91(int id0,int id1,int id2,double id3[]);
  public void TransformIndexToPhysicalPoint(int id0,int id1,int id2,double id3[])
  {
    TransformIndexToPhysicalPoint_91(id0,id1,id2,id3);
  }

  private native void TransformIndexToPhysicalPoint_92(int id0[],double id1[]);
  public void TransformIndexToPhysicalPoint(int id0[],double id1[])
  {
    TransformIndexToPhysicalPoint_92(id0,id1);
  }

  private native void TransformContinuousIndexToPhysicalPoint_93(double id0,double id1,double id2,double id3[],double id4[],double id5[],double id6[]);
  public void TransformContinuousIndexToPhysicalPoint(double id0,double id1,double id2,double id3[],double id4[],double id5[],double id6[])
  {
    TransformContinuousIndexToPhysicalPoint_93(id0,id1,id2,id3,id4,id5,id6);
  }

  private native long GetPhysicalToIndexMatrix_94();
  public vtkMatrix4x4 GetPhysicalToIndexMatrix()
  {
    long temp = GetPhysicalToIndexMatrix_94();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ApplyPhysicalToIndexMatrix_95(vtkMatrix4x4 id0);
  public void ApplyPhysicalToIndexMatrix(vtkMatrix4x4 id0)
  {
    ApplyPhysicalToIndexMatrix_95(id0);
  }

  private native void TransformPhysicalPointToContinuousIndex_96(double id0,double id1,double id2,double id3[]);
  public void TransformPhysicalPointToContinuousIndex(double id0,double id1,double id2,double id3[])
  {
    TransformPhysicalPointToContinuousIndex_96(id0,id1,id2,id3);
  }

  private native void TransformPhysicalPointToContinuousIndex_97(double id0[],double id1[]);
  public void TransformPhysicalPointToContinuousIndex(double id0[],double id1[])
  {
    TransformPhysicalPointToContinuousIndex_97(id0,id1);
  }

  private native void TransformPhysicalNormalToContinuousIndex_98(double id0[],double id1[]);
  public void TransformPhysicalNormalToContinuousIndex(double id0[],double id1[])
  {
    TransformPhysicalNormalToContinuousIndex_98(id0,id1);
  }

  private native void TransformPhysicalPlaneToContinuousIndex_99(double id0[],double id1[]);
  public void TransformPhysicalPlaneToContinuousIndex(double id0[],double id1[])
  {
    TransformPhysicalPlaneToContinuousIndex_99(id0,id1);
  }

  private native void ComputeIndexToPhysicalMatrix_100(double id0[],double id1[],double id2[],double id3[]);
  public void ComputeIndexToPhysicalMatrix(double id0[],double id1[],double id2[],double id3[])
  {
    ComputeIndexToPhysicalMatrix_100(id0,id1,id2,id3);
  }

  private native void ComputePhysicalToIndexMatrix_101(double id0[],double id1[],double id2[],double id3[]);
  public void ComputePhysicalToIndexMatrix(double id0[],double id1[],double id2[],double id3[])
  {
    ComputePhysicalToIndexMatrix_101(id0,id1,id2,id3);
  }

  private native void SetScalarType_102(int id0,vtkInformation id1);
  public void SetScalarType(int id0,vtkInformation id1)
  {
    SetScalarType_102(id0,id1);
  }

  private native int GetScalarType_103(vtkInformation id0);
  public int GetScalarType(vtkInformation id0)
  {
    return GetScalarType_103(id0);
  }

  private native boolean HasScalarType_104(vtkInformation id0);
  public boolean HasScalarType(vtkInformation id0)
  {
    return HasScalarType_104(id0);
  }

  private native int GetScalarType_105();
  public int GetScalarType()
  {
    return GetScalarType_105();
  }

  private native byte[] GetScalarTypeAsString_106();
  public String GetScalarTypeAsString()
  {
    return new String(GetScalarTypeAsString_106(), StandardCharsets.UTF_8);
  }

  private native void SetNumberOfScalarComponents_107(int id0,vtkInformation id1);
  public void SetNumberOfScalarComponents(int id0,vtkInformation id1)
  {
    SetNumberOfScalarComponents_107(id0,id1);
  }

  private native int GetNumberOfScalarComponents_108(vtkInformation id0);
  public int GetNumberOfScalarComponents(vtkInformation id0)
  {
    return GetNumberOfScalarComponents_108(id0);
  }

  private native boolean HasNumberOfScalarComponents_109(vtkInformation id0);
  public boolean HasNumberOfScalarComponents(vtkInformation id0)
  {
    return HasNumberOfScalarComponents_109(id0);
  }

  private native int GetNumberOfScalarComponents_110();
  public int GetNumberOfScalarComponents()
  {
    return GetNumberOfScalarComponents_110();
  }

  private native void CopyInformationFromPipeline_111(vtkInformation id0);
  public void CopyInformationFromPipeline(vtkInformation id0)
  {
    CopyInformationFromPipeline_111(id0);
  }

  private native void CopyInformationToPipeline_112(vtkInformation id0);
  public void CopyInformationToPipeline(vtkInformation id0)
  {
    CopyInformationToPipeline_112(id0);
  }

  private native void PrepareForNewData_113();
  public void PrepareForNewData()
  {
    PrepareForNewData_113();
  }

  private native void ShallowCopy_114(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_114(id0);
  }

  private native void DeepCopy_115(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_115(id0);
  }

  private native long GetTupleIndex_116(vtkDataArray id0,int id1[]);
  public long GetTupleIndex(vtkDataArray id0,int id1[])
  {
    return GetTupleIndex_116(id0,id1);
  }

  private native void GetArrayIncrements_117(vtkDataArray id0,long id1[]);
  public void GetArrayIncrements(vtkDataArray id0,long id1[])
  {
    GetArrayIncrements_117(id0,id1);
  }

  private native int GetExtentType_118();
  public int GetExtentType()
  {
    return GetExtentType_118();
  }

  private native long GetData_119(vtkInformation id0);
  public vtkImageData GetData(vtkInformation id0)
  {
    long temp = GetData_119(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_120(vtkInformationVector id0,int id1);
  public vtkImageData GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_120(id0,id1);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkImageData() { super(); }

  public vtkImageData(long id) { super(id); }
  public native long   VTKInit();

}
